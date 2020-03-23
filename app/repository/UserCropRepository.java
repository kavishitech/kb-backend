package repository;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import io.ebean.Model;
import models.UserCrop;
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
public class UserCropRepository {

    private final EbeanServer ebeanServer;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public UserCropRepository(EbeanConfig ebeanConfig, DatabaseExecutionContext executionContext) {
        this.ebeanServer = Ebean.getServer(ebeanConfig.defaultServer());
        this.executionContext = executionContext;
    }



    public CompletionStage<List<UserCrop>> page(long farmerId) {
        return supplyAsync(() ->
                ebeanServer.find(UserCrop.class).where().eq("farmerId",farmerId).
                        findList(), executionContext);
    }

    public CompletionStage<UserCrop> lookup(Long id) {
        return supplyAsync(() -> ebeanServer.find(UserCrop.class).setId(id).findOne(), executionContext);

    }

    public CompletionStage<Long> updateNames( UserCrop newUserCropData) {
        return supplyAsync(() -> {
            Long value = 0l;
                UserCrop savedUserCrop = ebeanServer.find(UserCrop.class).setId(newUserCropData.id).findOne();
                if (savedUserCrop != null) {
                    savedUserCrop.setName(newUserCropData.getName());
                    savedUserCrop.setAcres(newUserCropData.getAcres());
                    savedUserCrop.setGuntha(newUserCropData.getGuntha());

                    savedUserCrop.update();
                    value = savedUserCrop.id;
                }
            return value;
        }, executionContext);
    }

    public CompletionStage<Optional<Long>>  delete(Long id) {
        return supplyAsync(() -> {
            try {
                final Optional<UserCrop> userCropOptional = Optional.ofNullable(ebeanServer.find(UserCrop.class).setId(id).findOne());
                userCropOptional.ifPresent(Model::delete);
                return userCropOptional.map(c -> c.id);
            } catch (Exception e) {
                return Optional.empty();
            }
        }, executionContext);
    }

    public CompletionStage<Long> insert(UserCrop userCrop) {
        return supplyAsync(() -> {
             ebeanServer.insert(userCrop);
             return userCrop.id;
        }, executionContext);
    }
}
