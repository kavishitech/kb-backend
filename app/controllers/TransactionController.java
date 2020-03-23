package controllers;

import models.Transaction;
import play.i18n.MessagesApi;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import service.TransactionService;

import javax.inject.Inject;
import javax.persistence.PersistenceException;
import java.util.concurrent.CompletionStage;

public class TransactionController extends Controller {

    private final TransactionService transactionService;
    private final HttpExecutionContext httpExecutionContext;
    private final MessagesApi messagesApi;

    @Inject
    public TransactionController(TransactionService TransactionService,
                                 HttpExecutionContext httpExecutionContext,
                                 MessagesApi messagesApi) {
        this.transactionService = TransactionService;
        this.httpExecutionContext = httpExecutionContext;
        this.messagesApi = messagesApi;
    }

    public CompletionStage<Result> list(long farmerId) {
        return transactionService.list(farmerId).thenApplyAsync(list -> {return ok(Json.toJson(list));},httpExecutionContext.current());
    }

    public CompletionStage<Result> get(long id) {
        return transactionService.getById(id).thenApplyAsync(list -> {return ok(Json.toJson(list));},httpExecutionContext.current());
    }


    public CompletionStage<Result> update(Http.Request request) throws PersistenceException {
        Transaction transaction = Json.fromJson(request.body().asJson(), Transaction.class);
        return transactionService.update(transaction).thenApplyAsync(data -> {return ok(Json.toJson(transaction));
        }, httpExecutionContext.current());
    }

    public CompletionStage<Result> create(Http.Request request) {
        Transaction transaction = Json.fromJson(request.body().asJson(), Transaction.class);
        // Run companies db operation and then render the form
        return transactionService.create(transaction).thenApplyAsync(data -> {
            // This is the HTTP rendering thread context
            return ok(transaction.id.toString());
        }, httpExecutionContext.current());
    }

}
