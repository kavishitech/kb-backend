package controllers;

import models.Soil;
import play.i18n.MessagesApi;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import service.SoilService;

import javax.inject.Inject;
import javax.persistence.PersistenceException;
import java.util.concurrent.CompletionStage;

public class SoilController extends Controller {

    private final SoilService soilService;
    private final HttpExecutionContext httpExecutionContext;
    private final MessagesApi messagesApi;

    @Inject
    public SoilController(SoilService soilService,
                          HttpExecutionContext httpExecutionContext,
                          MessagesApi messagesApi) {
        this.soilService = soilService;
        this.httpExecutionContext = httpExecutionContext;
        this.messagesApi = messagesApi;
    }

    public CompletionStage<Result> list() {
        return soilService.list().thenApplyAsync(list -> {return ok(Json.toJson(list));},httpExecutionContext.current());
    }

    public CompletionStage<Result> get(long id) {
        return soilService.getById(id).thenApplyAsync(list -> {return ok(Json.toJson(list));},httpExecutionContext.current());
    }


    public CompletionStage<Result> update(Http.Request request) throws PersistenceException {
        Soil soil = Json.fromJson(request.body().asJson(), Soil.class);
        return soilService.update(soil).thenApplyAsync(data -> {return ok(Json.toJson(soil));
        }, httpExecutionContext.current());
    }

    public CompletionStage<Result> create(Http.Request request) {
        Soil soil = Json.fromJson(request.body().asJson(), Soil.class);
        // Run companies db operation and then render the form
        return soilService.create(soil).thenApplyAsync(data -> {
            // This is the HTTP rendering thread context
            return ok(soil.id.toString());
        }, httpExecutionContext.current());
    }

}
