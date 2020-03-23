package repository;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import io.ebean.Model;
import models.Crop;
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
public class CropRepository {

    private final EbeanServer ebeanServer;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public CropRepository(EbeanConfig ebeanConfig, DatabaseExecutionContext executionContext) {
        this.ebeanServer = Ebean.getServer(ebeanConfig.defaultServer());
        this.executionContext = executionContext;
    }



    public CompletionStage<List<Crop>> page() {
        return supplyAsync(() ->
                ebeanServer.find(Crop.class).
                        findList(), executionContext);
    }

    public CompletionStage<Crop> lookup(Long id) {
        return supplyAsync(() -> ebeanServer.find(Crop.class).setId(id).findOne(), executionContext);

    }

    public CompletionStage<Long> updateNames( Crop newCropData) {
        return supplyAsync(() -> {
            Long value = 0l;
                Crop savedCrop = ebeanServer.find(Crop.class).setId(newCropData.id).findOne();
                if (savedCrop != null) {
                    savedCrop.setName(newCropData.getName());
                    savedCrop.setCategory(newCropData.getCategory());

                    savedCrop.update();
                    value = savedCrop.id;
                }
            return value;
        }, executionContext);
    }

    public CompletionStage<Optional<Long>>  delete(Long id) {
        return supplyAsync(() -> {
            try {
                final Optional<Crop> CropOptional = Optional.ofNullable(ebeanServer.find(Crop.class).setId(id).findOne());
                CropOptional.ifPresent(Model::delete);
                return CropOptional.map(c -> c.id);
            } catch (Exception e) {
                return Optional.empty();
            }
        }, executionContext);
    }

    public CompletionStage<Long> insert(Crop crop) {
        return supplyAsync(() -> {
             ebeanServer.insert(crop);
             return crop.id;
        }, executionContext);
    }
}
