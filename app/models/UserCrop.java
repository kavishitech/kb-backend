package models;

import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.validation.Constraint;
import java.util.Date;


/**
 * Company entity managed by Ebean
 */
@Entity
public class UserCrop extends BaseModel {

    private static final long serialVersionUID = 1L;
    @Constraints.Required
    private long farmerId;
    @Constraints.Required
    private long cropId;
    @Constraints.Required
    private long landId;
    @Constraints.Required
    private long acres;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Constraints.Required
    private String name;
    private String status;
    private long guntha;
    private Date startDate;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(long farmerId) {
        this.farmerId = farmerId;
    }

    public long getCropId() {
        return cropId;
    }

    public void setCropId(long cropId) {
        this.cropId = cropId;
    }

    public long getLandId() {
        return landId;
    }

    public void setLandId(long landId) {
        this.landId = landId;
    }

    public long getAcres() {
        return acres;
    }

    public void setAcres(long acres) {
        this.acres = acres;
    }

    public long getGuntha() {
        return guntha;
    }

    public void setGuntha(long guntha) {
        this.guntha = guntha;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }


}




