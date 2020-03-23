package repository;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import io.ebean.Model;
import models.Soil;
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
public class SoilRepository {

    private final EbeanServer ebeanServer;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public SoilRepository(EbeanConfig ebeanConfig, DatabaseExecutionContext executionContext) {
        this.ebeanServer = Ebean.getServer(ebeanConfig.defaultServer());
        this.executionContext = executionContext;
    }



    public CompletionStage<List<Soil>> page() {
        return supplyAsync(() ->
                ebeanServer.find(Soil.class).
                        findList(), executionContext);
    }

    public CompletionStage<Soil> lookup(Long id) {
        return supplyAsync(() -> ebeanServer.find(Soil.class).setId(id).findOne(), executionContext);

    }

    public CompletionStage<Long> updateNames( Soil newSoilData) {
        return supplyAsync(() -> {
            Long value = 0l;
                Soil savedSoil = ebeanServer.find(Soil.class).setId(newSoilData.id).findOne();
                if (savedSoil != null) {
                    savedSoil.setName(newSoilData.getName());

                    savedSoil.update();
                    value = savedSoil.id;
                }
            return value;
        }, executionContext);
    }

    public CompletionStage<Optional<Long>>  delete(Long id) {
        return supplyAsync(() -> {
            try {
                final Optional<Soil> SoilOptional = Optional.ofNullable(ebeanServer.find(Soil.class).setId(id).findOne());
                SoilOptional.ifPresent(Model::delete);
                return SoilOptional.map(c -> c.id);
            } catch (Exception e) {
                return Optional.empty();
            }
        }, executionContext);
    }

    public CompletionStage<Long> insert(Soil soil) {
        return supplyAsync(() -> {
             ebeanServer.insert(soil);
             return soil.id;
        }, executionContext);
    }
}
