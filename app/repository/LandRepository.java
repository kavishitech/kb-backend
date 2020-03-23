package repository;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import io.ebean.Model;
import models.Land;
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
public class LandRepository {

    private final EbeanServer ebeanServer;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public LandRepository(EbeanConfig ebeanConfig, DatabaseExecutionContext executionContext) {
        this.ebeanServer = Ebean.getServer(ebeanConfig.defaultServer());
        this.executionContext = executionContext;
    }



    public CompletionStage<List<Land>> page(long farmerId) {
        return supplyAsync(() ->
                ebeanServer.find(Land.class).where().eq("farmerId",farmerId).
                        findList(), executionContext);
    }

    public CompletionStage<Land> lookup(Long id) {
        return supplyAsync(() -> ebeanServer.find(Land.class).setId(id).findOne(), executionContext);

    }

    public CompletionStage<Long> updateNames( Land newLandData) {
        return supplyAsync(() -> {
            Long value = 0l;
                Land savedLand = ebeanServer.find(Land.class).setId(newLandData.id).findOne();
                if (savedLand != null) {
                    savedLand.setName(newLandData.getName());
                    savedLand.setLatitude(newLandData.getLatitude());
                    savedLand.setLongitude(newLandData.getLongitude());
                    savedLand.setAcres(newLandData.getAcres());
                    savedLand.setGuntha(newLandData.getGuntha());
                    savedLand.setSoilType(newLandData.getSoilType());

                    savedLand.update();
                    value = savedLand.id;
                }
            return value;
        }, executionContext);
    }

    public CompletionStage<Optional<Long>>  delete(Long id) {
        return supplyAsync(() -> {
            try {
                final Optional<Land> landOptional = Optional.ofNullable(ebeanServer.find(Land.class).setId(id).findOne());
                landOptional.ifPresent(Model::delete);
                return landOptional.map(c -> c.id);
            } catch (Exception e) {
                return Optional.empty();
            }
        }, executionContext);
    }

    public CompletionStage<Long> insert(Land land) {
        return supplyAsync(() -> {
            land.setCreatedOn(System.currentTimeMillis());
             ebeanServer.insert(land);
             return land.id;
        }, executionContext);
    }
}
