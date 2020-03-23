package service;

import models.TransactionReason;
import repository.TransactionReasonRepository;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.CompletionStage;

/**
 * Manage a database of computers
 */
public class TransactionReasonService {

    private final TransactionReasonRepository transactionReasonRepository;

    @Inject
    public TransactionReasonService(
            TransactionReasonRepository transactionReasonRepository) {
        this.transactionReasonRepository = transactionReasonRepository;
    }


    public CompletionStage<List<TransactionReason>> list() {
        // Run a db operation in another thread (using DatabaseExecutionContext)
        return transactionReasonRepository.page();
    }

    public CompletionStage<TransactionReason> getById(long id) {

        return transactionReasonRepository.lookup(id);
    }

    public CompletionStage<Long> update(TransactionReason transactionReason) {
        return transactionReasonRepository.updateNames(transactionReason);
    }

    public CompletionStage<Long> create(TransactionReason transactionReason) {

        return transactionReasonRepository.insert(transactionReason);
    }
}
            
