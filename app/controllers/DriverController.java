package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import io.ebean.PagedList;
import models.Computer;
import models.Driver;
import play.data.Form;
import play.i18n.MessagesApi;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import repository.DriverRepository;
import service.DriverService;

import javax.inject.Inject;
import javax.persistence.PersistenceException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class DriverController extends Controller {

    private final DriverService driverService;
    private final HttpExecutionContext httpExecutionContext;
    private final MessagesApi messagesApi;

    @Inject
    public DriverController(DriverService driverService,
                          HttpExecutionContext httpExecutionContext,
                            MessagesApi messagesApi) {
        this.driverService = driverService;
        this.httpExecutionContext = httpExecutionContext;
        this.messagesApi = messagesApi;
    }

    public CompletionStage<Result> list() {
        return driverService.list().thenApplyAsync(list -> {return ok(Json.toJson(list));},httpExecutionContext.current());
    }

    public CompletionStage<Result> get(long id) {
        return driverService.getById(id).thenApplyAsync(list -> {return ok(Json.toJson(list));},httpExecutionContext.current());
    }


    public CompletionStage<Result> update(Http.Request request) throws PersistenceException {
        Driver driver = Json.fromJson(request.body().asJson(), Driver.class);
        return driverService.update(driver).thenApplyAsync(data -> {return ok(Json.toJson(driver));
        }, httpExecutionContext.current());
    }

    public CompletionStage<Result> create(Http.Request request) {
        Driver driver = Json.fromJson(request.body().asJson(), Driver.class);
        // Run companies db operation and then render the form
        return driverService.create(driver).thenApplyAsync(data -> {
            // This is the HTTP rendering thread context
            return ok(driver.id.toString());
        }, httpExecutionContext.current());
    }

}
