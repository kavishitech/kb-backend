package repository;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import io.ebean.Model;
import models.Transaction;
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
public class TransactionRepository {

    private final EbeanServer ebeanServer;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public TransactionRepository(EbeanConfig ebeanConfig, DatabaseExecutionContext executionContext) {
        this.ebeanServer = Ebean.getServer(ebeanConfig.defaultServer());
        this.executionContext = executionContext;
    }



    public CompletionStage<List<Transaction>> page(long farmerId) {
        return supplyAsync(() ->
                ebeanServer.find(Transaction.class).where().eq("farmerId",farmerId).
                        findList(), executionContext);
    }

    public CompletionStage<Transaction> lookup(Long id) {
        return supplyAsync(() -> ebeanServer.find(Transaction.class).setId(id).findOne(), executionContext);

    }

    public CompletionStage<Long> updateNames( Transaction newTransactionData) {
        return supplyAsync(() -> {
            Long value = 0l;
                Transaction savedTransaction = ebeanServer.find(Transaction.class).setId(newTransactionData.id).findOne();
                if (savedTransaction != null) {
                   /*
                   UPDATEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
                    */

                    savedTransaction.update();
                    value = savedTransaction.id;
                }
            return value;
        }, executionContext);
    }

    public CompletionStage<Optional<Long>>  delete(Long id) {
        return supplyAsync(() -> {
            try {
                final Optional<Transaction> transactionOptional = Optional.ofNullable(ebeanServer.find(Transaction.class).setId(id).findOne());
                transactionOptional.ifPresent(Model::delete);
                return transactionOptional.map(c -> c.id);
            } catch (Exception e) {
                return Optional.empty();
            }
        }, executionContext);
    }

    public CompletionStage<Long> insert(Transaction transaction) {
        return supplyAsync(() -> {
             ebeanServer.insert(transaction);
             return transaction.id;
        }, executionContext);
    }
}
