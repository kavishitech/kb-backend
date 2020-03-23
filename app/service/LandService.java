package service;

import models.Land;
import repository.LandRepository;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.CompletionStage;

/**
 * Manage a database of computers
 */
public class LandService {

    private final LandRepository landRepository;

    @Inject
    public LandService(
            LandRepository LandRepository) {
        this.landRepository = LandRepository;
    }


    public CompletionStage<List<Land>> list(long farmerId) {
        // Run a db operation in another thread (using DatabaseExecutionContext)
        return landRepository.page(farmerId);
    }

    public CompletionStage<Land> getById(long id) {

        return landRepository.lookup(id);
    }

    public CompletionStage<Long> update(Land land) {
        return landRepository.updateNames(land);
    }

    public CompletionStage<Long> create(Land land) {

        return landRepository.insert(land);
    }
}
            
