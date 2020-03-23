package repository;

import io.ebean.*;
import models.Computer;
import models.Driver;
import models.Driver;
import org.joda.time.DateTime;
import play.db.ebean.EbeanConfig;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletionStage;

import static java.util.concurrent.CompletableFuture.supplyAsync;

/**
 * A repository that executes database operations in a different
 * execution context.
 */
public class DriverRepository {

    private final EbeanServer ebeanServer;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public DriverRepository(EbeanConfig ebeanConfig, DatabaseExecutionContext executionContext) {
        this.ebeanServer = Ebean.getServer(ebeanConfig.defaultServer());
        this.executionContext = executionContext;
    }



    public CompletionStage<List<Driver>> page() {
        return supplyAsync(() ->
                ebeanServer.find(Driver.class).
                        findList(), executionContext);
    }

    public CompletionStage<Driver> lookup(Long id) {
        return supplyAsync(() -> ebeanServer.find(Driver.class).setId(id).findOne(), executionContext);

    }

    public CompletionStage<Long> updateNames( Driver newDriverData) {
        return supplyAsync(() -> {
            Long value = 0l;
                Driver savedDriver = ebeanServer.find(Driver.class).setId(newDriverData.id).findOne();
                if (savedDriver != null) {
                    savedDriver.setFirstName(newDriverData.getFirstName());
                    savedDriver.setLastName(newDriverData.getLastName());

                    savedDriver.update();
                    value = savedDriver.id;
                }
            return value;
        }, executionContext);
    }

    public CompletionStage<Optional<Long>>  delete(Long id) {
        return supplyAsync(() -> {
            try {
                final Optional<Driver> DriverOptional = Optional.ofNullable(ebeanServer.find(Driver.class).setId(id).findOne());
                DriverOptional.ifPresent(Model::delete);
                return DriverOptional.map(c -> c.id);
            } catch (Exception e) {
                return Optional.empty();
            }
        }, executionContext);
    }

    public CompletionStage<Long> insert(Driver driver) {
        return supplyAsync(() -> {
            driver.setCreatedOn(DateTime.now().toDateTime());
             ebeanServer.insert(driver);
             return driver.id;
        }, executionContext);
    }
}
