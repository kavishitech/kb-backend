package service;

import models.UserCrop;
import repository.UserCropRepository;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.CompletionStage;

/**
 * Manage a database of computers
 */
public class UserCropService {

    private final UserCropRepository userCropRepository;

    @Inject
    public UserCropService(
            UserCropRepository userCropRepository) {
        this.userCropRepository = userCropRepository;
    }


    public CompletionStage<List<UserCrop>> list(long farmerId) {
        // Run a db operation in another thread (using DatabaseExecutionContext)
        return userCropRepository.page(farmerId);
    }

    public CompletionStage<UserCrop> getById(long id) {

        return userCropRepository.lookup(id);
    }

    public CompletionStage<Long> update(UserCrop userCrop) {
        return userCropRepository.updateNames(userCrop);
    }

    public CompletionStage<Long> create(UserCrop userCrop) {

        return userCropRepository.insert(userCrop);
    }
}
            
