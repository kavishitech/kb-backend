package controllers;

import models.TransactionReason;
import play.i18n.MessagesApi;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import service.TransactionReasonService;

import javax.inject.Inject;
import javax.persistence.PersistenceException;
import java.util.concurrent.CompletionStage;

public class TransactionReasonController extends Controller {

    private final TransactionReasonService transactionReasonService;
    private final HttpExecutionContext httpExecutionContext;
    private final MessagesApi messagesApi;

    @Inject
    public TransactionReasonController(TransactionReasonService transactionReasonService,
                                       HttpExecutionContext httpExecutionContext,
                                       MessagesApi messagesApi) {
        this.transactionReasonService = transactionReasonService;
        this.httpExecutionContext = httpExecutionContext;
        this.messagesApi = messagesApi;
    }

    public CompletionStage<Result> list() {
        return transactionReasonService.list().thenApplyAsync(list -> {return ok(Json.toJson(list));},httpExecutionContext.current());
    }

    public CompletionStage<Result> get(long id) {
        return transactionReasonService.getById(id).thenApplyAsync(list -> {return ok(Json.toJson(list));},httpExecutionContext.current());
    }


    public CompletionStage<Result> update(Http.Request request) throws PersistenceException {
        TransactionReason transactionReason = Json.fromJson(request.body().asJson(), TransactionReason.class);
        return transactionReasonService.update(transactionReason).thenApplyAsync(data -> {return ok(Json.toJson(transactionReason));
        }, httpExecutionContext.current());
    }

    public CompletionStage<Result> create(Http.Request request) {
        TransactionReason transactionReason = Json.fromJson(request.body().asJson(), TransactionReason.class);
        // Run companies db operation and then render the form
        return transactionReasonService.create(transactionReason).thenApplyAsync(data -> {
            // This is the HTTP rendering thread context
            return ok(transactionReason.id.toString());
        }, httpExecutionContext.current());
    }

}
