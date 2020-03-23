package controllers;

import models.Farmer;
import play.i18n.MessagesApi;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import service.FarmerService;

import javax.inject.Inject;
import javax.persistence.PersistenceException;
import java.util.concurrent.CompletionStage;

public class FarmerController extends Controller {

    private final FarmerService FarmerService;
    private final HttpExecutionContext httpExecutionContext;
    private final MessagesApi messagesApi;

    @Inject
    public FarmerController(FarmerService FarmerService,
                            HttpExecutionContext httpExecutionContext,
                            MessagesApi messagesApi) {
        this.FarmerService = FarmerService;
        this.httpExecutionContext = httpExecutionContext;
        this.messagesApi = messagesApi;
    }

    public CompletionStage<Result> list() {
        return FarmerService.list().thenApplyAsync(list -> {return ok(Json.toJson(list));},httpExecutionContext.current());
    }

    public CompletionStage<Result> get(long id) {
        return FarmerService.getById(id).thenApplyAsync(list -> {return ok(Json.toJson(list));},httpExecutionContext.current());
    }


    public CompletionStage<Result> update(Http.Request request) throws PersistenceException {
        Farmer farmer = Json.fromJson(request.body().asJson(), Farmer.class);
        return FarmerService.update(farmer).thenApplyAsync(data -> {return ok(Json.toJson(farmer));
        }, httpExecutionContext.current());
    }

    public CompletionStage<Result> create(Http.Request request) {
        Farmer farmer = Json.fromJson(request.body().asJson(), Farmer.class);
        // Run companies db operation and then render the form
        return FarmerService.create(farmer).thenApplyAsync(data -> {
            // This is the HTTP rendering thread context
            return ok(farmer.id.toString());
        }, httpExecutionContext.current());
    }

}
