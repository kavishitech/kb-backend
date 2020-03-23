package service;

import models.Driver;
import play.libs.concurrent.HttpExecutionContext;
import repository.DriverRepository;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.CompletionStage;

/**
 * Manage a database of computers
 */
public class DriverService {

    private final DriverRepository driverRepository;

    @Inject
    public DriverService(
                            DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }




    public CompletionStage<List<Driver>> list() {
        // Run a db operation in another thread (using DatabaseExecutionContext)
        return driverRepository.page();
    }

    public CompletionStage<Driver> getById(long id) {

        return driverRepository.lookup(id);
    }

    public CompletionStage<Long> update( Driver driver) {
        return driverRepository.updateNames(driver);
    }

    public CompletionStage<Long> create(Driver driver) {

        return driverRepository.insert(driver);
    }
}
            
