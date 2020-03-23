package service;

import models.Crop;
import repository.CropRepository;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.CompletionStage;

/**
 * Manage a database of computers
 */
public class CropService {

    private final CropRepository cropRepository;

    @Inject
    public CropService(
                            CropRepository cropRepository) {
        this.cropRepository = cropRepository;
    }




    public CompletionStage<List<Crop>> list() {
        // Run a db operation in another thread (using DatabaseExecutionContext)
        return cropRepository.page();
    }

    public CompletionStage<Crop> getById(long id) {

        return cropRepository.lookup(id);
    }

    public CompletionStage<Long> update( Crop crop) {
        return cropRepository.updateNames(crop);
    }

    public CompletionStage<Long> create(Crop crop) {

        return cropRepository.insert(crop);
    }
}
            
