package models;

import org.joda.time.DateTime;
import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;


/**
 * Company entity managed by Ebean
 */
@Entity
public class Driver extends BaseModel {

    private static final long serialVersionUID = 1L;

    @Constraints.Required
    private String firstName;
    @Constraints.Required
    private String lastName;
    @Constraints.Required
    @Column(name = "created_on")
    private DateTime createdOn;

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

    public DateTime getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(DateTime createdOn) {
        this.createdOn = createdOn;
    }
}

