package controllers;

import models.UserCrop;
import play.i18n.MessagesApi;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import service.UserCropService;

import javax.inject.Inject;
import javax.persistence.PersistenceException;
import java.util.concurrent.CompletionStage;

public class UserCropController extends Controller {

    private final UserCropService userCropService;
    private final HttpExecutionContext httpExecutionContext;
    private final MessagesApi messagesApi;

    @Inject
    public UserCropController(UserCropService UserCropService,
                              HttpExecutionContext httpExecutionContext,
                              MessagesApi messagesApi) {
        this.userCropService = UserCropService;
        this.httpExecutionContext = httpExecutionContext;
        this.messagesApi = messagesApi;
    }

    public CompletionStage<Result> list(long farmerId) {
        return userCropService.list(farmerId).thenApplyAsync(list -> {return ok(Json.toJson(list));},httpExecutionContext.current());
    }

    public CompletionStage<Result> get(long id) {
        return userCropService.getById(id).thenApplyAsync(list -> {return ok(Json.toJson(list));},httpExecutionContext.current());
    }


    public CompletionStage<Result> update(Http.Request request) throws PersistenceException {
        UserCrop userCrop = Json.fromJson(request.body().asJson(), UserCrop.class);
        return userCropService.update(userCrop).thenApplyAsync(data -> {return ok(Json.toJson(userCrop));
        }, httpExecutionContext.current());
    }

    public CompletionStage<Result> create(Http.Request request) {
        UserCrop userCrop = Json.fromJson(request.body().asJson(), UserCrop.class);
        // Run companies db operation and then render the form
        return userCropService.create(userCrop).thenApplyAsync(data -> {
            // This is the HTTP rendering thread context
            return ok(userCrop.id.toString());
        }, httpExecutionContext.current());
    }

}
