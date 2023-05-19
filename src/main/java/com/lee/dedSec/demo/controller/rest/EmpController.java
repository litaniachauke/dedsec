package com.lee.dedSec.demo.controller.rest;

import com.lee.dedSec.demo.entity.Employee;
import com.lee.dedSec.demo.services.implementation.EmployeeServiceImplementation;
import com.lee.dedSec.demo.services.interfaces.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    private final EmployeeService employeeService;

    private EmpController(final EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    @PostMapping("/employees")
    public void addEmp(@RequestBody Employee employee){
        employeeService.addEmp(employee);
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
    @GetMapping("/employees/{empId}")
    public Employee findEmployeeId(@PathVariable(value="empId")Long empId){
        return employeeService.findEmployeeId(empId);
    }

    @PutMapping ("/employees")
    public void editEmp(@RequestBody Employee employee){
        employeeService.editEmployee(employee);
    }

    @DeleteMapping("/employees/{empId}")
    public void deleteEmployeeId(@PathVariable(value="empId")Long empId){
        employeeService.deleteEmployeeId(empId);
    }

}
