package service;

import models.Farmer;
import repository.FarmerRepository;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.CompletionStage;

/**
 * Manage a database of computers
 */
public class FarmerService {

    private final FarmerRepository farmerRepository;

    @Inject
    public FarmerService(
                            FarmerRepository FarmerRepository) {
        this.farmerRepository = FarmerRepository;
    }




    public CompletionStage<List<Farmer>> list() {
        // Run a db operation in another thread (using DatabaseExecutionContext)
        return farmerRepository.page();
    }

    public CompletionStage<Farmer> getById(long id) {

        return farmerRepository.lookup(id);
    }

    public CompletionStage<Long> update( Farmer farmer) {
        return farmerRepository.updateNames(farmer);
    }

    public CompletionStage<Long> create(Farmer farmer) {

        return farmerRepository.insert(farmer);
    }
}
            
