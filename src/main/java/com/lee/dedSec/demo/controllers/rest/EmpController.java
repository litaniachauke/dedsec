package com.lee.dedSec.demo.controllers.rest;

import com.lee.dedSec.demo.entity.Employee;
import com.lee.dedSec.demo.repository.EmployeeRepo;
import com.lee.dedSec.demo.services.implementation.EmployeeImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    EmployeeImp imp = new EmployeeImp();

    @PostMapping("/addEmp")
    public void addEmp(@RequestBody Employee employee){
        imp.addEmp(employee);
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return imp.findAll();
    }
    @GetMapping("/employees/{empId}")
    public Employee findEmployeeId(@PathVariable(value="empId")Long empId){
        return imp.findEmployeeId(empId);
    }

    @DeleteMapping("/employees/{empId}")
    public void deleteEmployeeId(@PathVariable(value="empId")Long empId){
        imp.deleteEmployeeId(empId);
    }

}
