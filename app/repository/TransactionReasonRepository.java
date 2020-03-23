package repository;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import io.ebean.Model;
import models.TransactionReason;
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
public class TransactionReasonRepository {

    private final EbeanServer ebeanServer;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public TransactionReasonRepository(EbeanConfig ebeanConfig, DatabaseExecutionContext executionContext) {
        this.ebeanServer = Ebean.getServer(ebeanConfig.defaultServer());
        this.executionContext = executionContext;
    }



    public CompletionStage<List<TransactionReason>> page() {
        return supplyAsync(() ->
                ebeanServer.find(TransactionReason.class).
                        findList(), executionContext);
    }

    public CompletionStage<TransactionReason> lookup(Long id) {
        return supplyAsync(() -> ebeanServer.find(TransactionReason.class).setId(id).findOne(), executionContext);

    }

    public CompletionStage<Long> updateNames( TransactionReason newTransactionReasonData) {
        return supplyAsync(() -> {
            Long value = 0l;
                TransactionReason savedTransactionReasonData = ebeanServer.find(TransactionReason.class).setId(newTransactionReasonData.id).findOne();
                if (savedTransactionReasonData != null) {
                   /*
                   UPDATEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
                    */

                    savedTransactionReasonData.update();
                    value = savedTransactionReasonData.id;
                }
            return value;
        }, executionContext);
    }

    public CompletionStage<Optional<Long>>  delete(Long id) {
        return supplyAsync(() -> {
            try {
                final Optional<TransactionReason> transactionReasonOptional = Optional.ofNullable(ebeanServer.find(TransactionReason.class).setId(id).findOne());
                transactionReasonOptional.ifPresent(Model::delete);
                return transactionReasonOptional.map(c -> c.id);
            } catch (Exception e) {
                return Optional.empty();
            }
        }, executionContext);
    }

    public CompletionStage<Long> insert(TransactionReason transactionReason) {
        return supplyAsync(() -> {
             ebeanServer.insert(transactionReason);
             return transactionReason.id;
        }, executionContext);
    }
}
