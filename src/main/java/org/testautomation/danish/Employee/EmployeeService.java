package org.testautomation.danish.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.testautomation.danish.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private Emplpoyeerepositery emplpoyeerepositery;


   /* private List < Employee> departments  =  new ArrayList<>(Arrays.asList(new Employee("IT", "Reporting", "Internal Reporting"),
                new Employee("Finance", "Accounting", "Ledger"))); */

    public List<Employee> getAllEmployee(String departmentId){

        List<Employee> employee = new ArrayList<Employee>();

        emplpoyeerepositery.findByDepartmentId( departmentId).forEach(employee:: add);
       // return departments

        return employee;
    }

    public Optional<Employee> getEmployee(String Id){

        return emplpoyeerepositery.findById(Id);

        //return departments.stream().fi.lter(t-> t.getId().equals(Id)).findFirst().get();

    }

    public void addEmployee(Employee employee) {

        emplpoyeerepositery.save(employee);

        //departments.add(employee);
    }


    public void updateEmployee(Employee employee) {

        emplpoyeerepositery.save(employee);


//        int t=0;
//        for(Employee d: departments){
//
//
//            if(d.getId().equals(id))
//
//                departments.set(t,employee);
//
//            t++;
//
//        }


    }

    public void deleteEmployee(String id) {

        emplpoyeerepositery.deleteById(id);

       // departments.removeIf(t-> t.getId().equals(id));
    }
}
