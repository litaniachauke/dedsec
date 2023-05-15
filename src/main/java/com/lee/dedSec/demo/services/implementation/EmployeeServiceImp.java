package com.lee.dedSec.demo.services.implementation;

import com.lee.dedSec.demo.entity.Employee;
import com.lee.dedSec.demo.repository.EmployeeRepo;
import com.lee.dedSec.demo.services.interfaces.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import java.util.List;

public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    private EmployeeRepo repo;
    @Override
    public List<Employee> findAll() {
        return repo.findAll();
    }

    @Override
    public void addEmp(Employee employee) {
        repo.save(employee);
    }
 
    @Override
    public Employee findEmployeeId(Long empId) {
        Employee emp = repo.findById(empId).orElseThrow(()-> new ResourceNotFoundException());
        return emp;
    }

    @Override
    public void deleteEmployeeId(Long empId) {
        Employee emp = repo.findById(empId).orElseThrow(()-> new ResourceNotFoundException());
        repo.delete(emp);
    }
}
