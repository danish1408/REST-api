package org.testautomation.danish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.testautomation.danish.Department;
import org.testautomation.danish.DepartmentService;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService ds;

    @RequestMapping("/department")

    public List<Department> getDepartments(){

        return  ds.getAllDepartments();

    }


    @RequestMapping("/department/{Id}")
    public Optional<Department> getDepartment(@PathVariable String Id){

        return ds.getDepartment(Id);

    }

    @RequestMapping( method = RequestMethod.POST, value = "/department")
    public void  adDepartment(@RequestBody Department department){

       ds.addDepartment(department);


    }

    @RequestMapping( method = RequestMethod.PUT, value = "/department/{Id}")
    public void  updateDepartment(@RequestBody Department department, @PathVariable String Id ){

        ds.updateDept(department, Id);


    }

    @RequestMapping( method = RequestMethod.DELETE, value = "/department/{Id}")
    public void  deleteDepartment(@PathVariable String Id ){

        ds.deleteDept( Id);


    }


    }



