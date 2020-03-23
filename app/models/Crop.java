package models;

import play.data.validation.Constraints;

import javax.persistence.Entity;


/**
 * Company entity managed by Ebean
 */
@Entity
public class Crop extends BaseModel {

    private static final long serialVersionUID = 1L;
    @Constraints.Required
    private String name;
    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}




