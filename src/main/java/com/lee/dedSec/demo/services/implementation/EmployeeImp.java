package com.lee.dedSec.demo.services.implementation;

import com.lee.dedSec.demo.classes.entity.Employee;
import com.lee.dedSec.demo.reposetory.EmployeeRepo;
import com.lee.dedSec.demo.services.interfaces.EmployeeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import java.util.List;

public class EmployeeImp implements EmployeeInterface {
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
