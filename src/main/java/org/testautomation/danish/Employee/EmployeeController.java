package org.testautomation.danish.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.testautomation.danish.Department;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService es;

    @RequestMapping("/department/{Id}/allEmployee")

    public List<Employee> getAllEmployee(@PathVariable String Id){

        return  es.getAllEmployee(Id);

    }


    @RequestMapping("/department/{departmentId}/allEmployee/{Id}")
    public Optional<Employee> getEmployee(@PathVariable String Id){

        return es.getEmployee(Id);

    }

    @RequestMapping( method = RequestMethod.POST, value = "/department/{departmentId}/allEmployee")
    public void  adEmploye(@RequestBody Employee employee, @PathVariable String departmentId){

        employee.setDepartment(new Department(departmentId, "", ""));

       es.addEmployee(employee);


    }

    @RequestMapping( method = RequestMethod.PUT, value = "/department/{departmentId}/allEmplpyee/{Id}")
    public void  updateEmploye(@RequestBody Employee employee, @PathVariable String Id, @PathVariable String depId ){
        employee.setDepartment(new Department(depId, "", ""));
        es.updateEmployee(employee);


    }

    @RequestMapping( method = RequestMethod.DELETE, value = "/department/{departmentId}/allEmplpyee/{Id}")
    public void  deleteEmploye(@PathVariable String Id ){

        es.deleteEmployee(Id);

    }


    }



