package org.testautomation.danish;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    private String id;
    private String Name;
    private String Description;

    public Department(){

    }

    public Department(String id, String name, String description) {
        super();
        this.id = id;
        Name = name;
        Description = description;
    }

    public void setId(String id) {
        this.id = id;
    }



    public void setName(String name) {
        Name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }
}
