package com.lee.dedSec.demo.services.interfaces;

import com.lee.dedSec.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();
    public void addEmp(Employee employee);
    public Employee findEmployeeId(Long empId);
    public void deleteEmployeeId(Long empId);
    public void editEmployee(Employee employee);
}
