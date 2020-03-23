package models;

import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;


/**
 * Company entity managed by Ebean
 */
@Entity
public class TransactionReason extends BaseModel {

    private static final long serialVersionUID = 1L;
    private String name;


    @Column(name = "transaction_level")
    @Constraints.Required
    private int level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}




