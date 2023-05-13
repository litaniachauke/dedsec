package com.lee.dedSec.demo.services.interfaces;

import com.lee.dedSec.demo.entity.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface EmployeeInterface {
    public List<Employee> findAll();
    public void addEmp(@RequestBody Employee employee);
    public Employee findEmployeeId(@PathVariable(value="empId")Long empId);
    public void deleteEmployeeId(@PathVariable(value="empId")Long empId);
}
