package com.lee.dedSec.demo.controller;

import com.lee.dedSec.demo.entity.Employee;
import com.lee.dedSec.demo.services.implementation.EmployeeServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    EmployeeServiceImp imp = new EmployeeServiceImp();

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
