package service;

import models.Soil;
import repository.SoilRepository;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.CompletionStage;

/**
 * Manage a database of computers
 */
public class SoilService {

    private final SoilRepository soilRepository;

    @Inject
    public SoilService(
                            SoilRepository soilRepository) {
        this.soilRepository = soilRepository;
    }




    public CompletionStage<List<Soil>> list() {
        // Run a db operation in another thread (using DatabaseExecutionContext)
        return soilRepository.page();
    }

    public CompletionStage<Soil> getById(long id) {

        return soilRepository.lookup(id);
    }

    public CompletionStage<Long> update( Soil soil) {
        return soilRepository.updateNames(soil);
    }

    public CompletionStage<Long> create(Soil soil) {

        return soilRepository.insert(soil);
    }
}
            
