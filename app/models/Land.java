package models;

import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;


/**
 * Company entity managed by Ebean
 */
@Entity
public class Land extends BaseModel {

    private static final long serialVersionUID = 1L;
    @Constraints.Required
    private String name;
    private String latitude, longitude;
    private int acres, guntha;
    @Constraints.Required
    private int farmerId;
    private int soilType;
    private long createdOn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public int getAcres() {
        return acres;
    }

    public void setAcres(int acres) {
        this.acres = acres;
    }

    public int getGuntha() {
        return guntha;
    }

    public void setGuntha(int guntha) {
        this.guntha = guntha;
    }

    public int getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(int farmerId) {
        this.farmerId = farmerId;
    }

    public int getSoilType() {
        return soilType;
    }

    public void setSoilType(int soilType) {
        this.soilType = soilType;
    }

    public long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(long createdOn) {
        this.createdOn = createdOn;
    }
}




