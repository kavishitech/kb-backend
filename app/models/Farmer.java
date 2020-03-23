package models;

import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;


/**
 * Company entity managed by Ebean
 */
@Entity
public class Farmer extends BaseModel {

    private static final long serialVersionUID = 1L;

    @Constraints.Required
    private String firstName;
    private String middleName;
    @Constraints.Required
    private String lastName;
    private int mobileNumber;
    @Constraints.Required
    private Date dob;
    @Constraints.Required
    private String gender;
    @Column(name = "registered_on")
    private long registeredOn;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getRegisteredOn() {
        return this.registeredOn;
    }

    public void setRegisteredOn(long registeredOn) {
        this.registeredOn = registeredOn;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}

