package controllers;

import models.Land;
import play.Logger;
import play.i18n.MessagesApi;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import service.LandService;

import javax.inject.Inject;
import javax.persistence.PersistenceException;
import java.util.concurrent.CompletionStage;

public class LandController extends Controller {

    private final LandService LandService;
    private final HttpExecutionContext httpExecutionContext;
    private final MessagesApi messagesApi;

    @Inject
    public LandController(LandService LandService,
                          HttpExecutionContext httpExecutionContext,
                          MessagesApi messagesApi) {
        this.LandService = LandService;
        this.httpExecutionContext = httpExecutionContext;
        this.messagesApi = messagesApi;
    }

    public CompletionStage<Result> list(long farmerId) {
        return LandService.list(farmerId).thenApplyAsync(list -> {return ok(Json.toJson(list));},httpExecutionContext.current());
    }

    public CompletionStage<Result> get(long id) {
        Logger.of(LandController.class).info("Inside");
        return LandService.getById(id).thenApplyAsync(list -> {return ok(Json.toJson(list));},httpExecutionContext.current());
    }


    public CompletionStage<Result> update(Http.Request request) throws PersistenceException {
        Land land = Json.fromJson(request.body().asJson(), Land.class);
        return LandService.update(land).thenApplyAsync(data -> {return ok(Json.toJson(land));
        }, httpExecutionContext.current());
    }

    public CompletionStage<Result> create(Http.Request request) {
        Land land = Json.fromJson(request.body().asJson(), Land.class);
        // Run companies db operation and then render the form
        return LandService.create(land).thenApplyAsync(data -> {
            // This is the HTTP rendering thread context
            return ok(land.id.toString());
        }, httpExecutionContext.current());
    }

}
