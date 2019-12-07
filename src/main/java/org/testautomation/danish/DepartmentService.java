package org.testautomation.danish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private Departmentrepositery departmentrepositery;


   /* private List < Employee> departments  =  new ArrayList<>(Arrays.asList(new Employee("IT", "Reporting", "Internal Reporting"),
                new Employee("Finance", "Accounting", "Ledger"))); */

    public List<Department> getAllDepartments(){

        List<Department> department = new ArrayList<Department>();

        departmentrepositery.findAll().forEach(department:: add);
       // return departments

        return department;
    }

    public Optional<Department> getDepartment(String Id){

        return departmentrepositery.findById(Id);

        //return departments.stream().fi.lter(t-> t.getId().equals(Id)).findFirst().get();

    }

    public void addDepartment(Department department) {

        departmentrepositery.save(department);

        //departments.add(department);
    }


    public void updateDept(Department department, String id) {

        departmentrepositery.save(department);


//        int t=0;
//        for(Employee d: departments){
//
//
//            if(d.getId().equals(id))
//
//                departments.set(t,department);
//
//            t++;
//
//        }


    }

    public void deleteDept(String id) {

        departmentrepositery.deleteById(id);

       // departments.removeIf(t-> t.getId().equals(id));
    }
}
