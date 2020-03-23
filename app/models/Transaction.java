package models;

import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;


/**
 * Company entity managed by Ebean
 */
@Entity
public class Transaction extends BaseModel {

    private static final long serialVersionUID = 1L;
    @Constraints.Required
    private long farmerId;
    @Column(name = "user_crop_id")
    private Long userCropId;
    private Long landId;
    @Constraints.Required
    private double amount;
    @Constraints.Required
    private int type;
    @Constraints.Required
    private long reasonId;
    private double qty,duration;
    private Date date;

    public long getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(long farmerId) {
        this.farmerId = farmerId;
    }

    public Long getUserCropId() {
        return userCropId;
    }

    public void setUserCropId(Long userCropId) {
        this.userCropId = userCropId;
    }

    public Long getLandId() {
        return landId;
    }

    public void setLandId(Long landId) {
        this.landId = landId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getReasonId() {
        return reasonId;
    }

    public void setReasonId(long reasonId) {
        this.reasonId = reasonId;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



}




