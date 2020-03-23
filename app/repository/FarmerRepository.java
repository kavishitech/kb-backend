package repository;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import io.ebean.Model;
import models.Farmer;
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
public class FarmerRepository {

    private final EbeanServer ebeanServer;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public FarmerRepository(EbeanConfig ebeanConfig, DatabaseExecutionContext executionContext) {
        this.ebeanServer = Ebean.getServer(ebeanConfig.defaultServer());
        this.executionContext = executionContext;
    }



    public CompletionStage<List<Farmer>> page() {
        return supplyAsync(() ->
                ebeanServer.find(Farmer.class).
                        findList(), executionContext);
    }

    public CompletionStage<Farmer> lookup(Long id) {
        return supplyAsync(() -> ebeanServer.find(Farmer.class).setId(id).findOne(), executionContext);

    }

    public CompletionStage<Long> updateNames( Farmer newFarmerData) {
        return supplyAsync(() -> {
            Long value = 0l;
                Farmer savedFarmer = ebeanServer.find(Farmer.class).setId(newFarmerData.id).findOne();
                if (savedFarmer != null) {
                    savedFarmer.setFirstName(newFarmerData.getFirstName());
                    savedFarmer.setLastName(newFarmerData.getLastName());
                    savedFarmer.setMobileNumber(newFarmerData.getMobileNumber());
                    savedFarmer.setDob(newFarmerData.getDob());

                    savedFarmer.update();
                    value = savedFarmer.id;
                }
            return value;
        }, executionContext);
    }

    public CompletionStage<Optional<Long>>  delete(Long id) {
        return supplyAsync(() -> {
            try {
                final Optional<Farmer> farmerOptional = Optional.ofNullable(ebeanServer.find(Farmer.class).setId(id).findOne());
                farmerOptional.ifPresent(Model::delete);
                return farmerOptional.map(c -> c.id);
            } catch (Exception e) {
                return Optional.empty();
            }
        }, executionContext);
    }

    public CompletionStage<Long> insert(Farmer farmer) {
        return supplyAsync(() -> {
            farmer.setRegisteredOn(System.currentTimeMillis());
             ebeanServer.insert(farmer);
             return farmer.id;
        }, executionContext);
    }
}
