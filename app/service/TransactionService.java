package service;

import models.Transaction;
import repository.TransactionRepository;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.CompletionStage;

/**
 * Manage a database of computers
 */
public class TransactionService {

    private final TransactionRepository transactionRepository;

    @Inject
    public TransactionService(
            TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }


    public CompletionStage<List<Transaction>> list(long farmerId) {
        // Run a db operation in another thread (using DatabaseExecutionContext)
        return transactionRepository.page(farmerId);
    }

    public CompletionStage<Transaction> getById(long id) {

        return transactionRepository.lookup(id);
    }

    public CompletionStage<Long> update(Transaction transaction) {
        return transactionRepository.updateNames(transaction);
    }

    public CompletionStage<Long> create(Transaction transaction) {

        return transactionRepository.insert(transaction);
    }
}
            
