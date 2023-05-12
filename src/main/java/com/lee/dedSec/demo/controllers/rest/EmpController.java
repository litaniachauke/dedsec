package com.lee.dedSec.demo.controllers.rest;

import com.lee.dedSec.demo.classes.entity.Employee;
import com.lee.dedSec.demo.reposetory.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    private EmployeeRepo repo;

    @PostMapping("/addEmp")
    public void addEmp(@RequestBody Employee employee){

        repo.save(employee);
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){

        return repo.findAll();
    }
    @GetMapping("/employees/{empId}")
    public Employee findEmployeeId(@PathVariable(value="empId")Long empId){
        Employee emp = repo.findById(empId).orElseThrow(()-> new ResourceNotFoundException());
        return emp;
    }

    @DeleteMapping("/employees/{empId}")
    public void deleteEmployeeId(@PathVariable(value="empId")Long empId){
        Employee emp = repo.findById(empId).orElseThrow(()-> new ResourceNotFoundException());
        repo.delete(emp);

    }

}
