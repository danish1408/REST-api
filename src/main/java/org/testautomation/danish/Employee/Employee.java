package org.testautomation.danish.Employee;


import org.testautomation.danish.Department;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

    @Id
    private String id;
    private String Name;
    private String Description;


    @ManyToOne
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    public Employee(){

    }

    public Employee(String id, String name, String description, String departmentId) {
        super();
        this.id = id;
        Name = name;
        Description = description;
        this.department= new Department(departmentId, "" ,"");
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
