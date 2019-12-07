package org.testautomation.danish.Employee;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Emplpoyeerepositery extends CrudRepository<Employee, String> {

    public List<Employee> findByDepartmentId(String DepartmentId);
}
