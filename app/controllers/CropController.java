package controllers;

import models.Crop;
import play.i18n.MessagesApi;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import service.CropService;

import javax.inject.Inject;
import javax.persistence.PersistenceException;
import java.util.concurrent.CompletionStage;

public class CropController extends Controller {

    private final CropService cropService;
    private final HttpExecutionContext httpExecutionContext;
    private final MessagesApi messagesApi;

    @Inject
    public CropController(CropService cropService,
                          HttpExecutionContext httpExecutionContext,
                          MessagesApi messagesApi) {
        this.cropService = cropService;
        this.httpExecutionContext = httpExecutionContext;
        this.messagesApi = messagesApi;
    }

    public CompletionStage<Result> list() {
        return cropService.list().thenApplyAsync(list -> {return ok(Json.toJson(list));},httpExecutionContext.current());
    }

    public CompletionStage<Result> get(long id) {
        return cropService.getById(id).thenApplyAsync(list -> {return ok(Json.toJson(list));},httpExecutionContext.current());
    }


    public CompletionStage<Result> update(Http.Request request) throws PersistenceException {
        Crop crop = Json.fromJson(request.body().asJson(), Crop.class);
        return cropService.update(crop).thenApplyAsync(data -> {return ok(Json.toJson(crop));
        }, httpExecutionContext.current());
    }

    public CompletionStage<Result> create(Http.Request request) {
        Crop crop = Json.fromJson(request.body().asJson(), Crop.class);
        // Run companies db operation and then render the form
        return cropService.create(crop).thenApplyAsync(data -> {
            // This is the HTTP rendering thread context
            return ok(crop.id.toString());
        }, httpExecutionContext.current());
    }

}
