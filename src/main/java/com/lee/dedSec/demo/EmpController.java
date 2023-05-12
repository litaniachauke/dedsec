package com.lee.dedSec.demo;

import com.lee.dedSec.demo.classes.applicants.Employee;
import com.lee.dedSec.demo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
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

    @PostMapping("/employees")
    public ResponseEntity<List<Employee>> findAll(){
        return ResponseEntity.ok(repo.findAll());
    }
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> findEmployeeId(@PathVariable(value="Id")Long id){
        Employee emp = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException());
        return ResponseEntity.ok().body(emp);
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Void> deleteEmployeeId(@PathVariable(value="Id")Long id){
        Employee emp = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException());
        repo.delete(emp);
        return ResponseEntity.ok().build();
    }

}
