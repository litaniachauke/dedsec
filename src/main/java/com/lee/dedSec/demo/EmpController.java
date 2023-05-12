package com.lee.dedSec.demo;

import com.lee.dedSec.demo.classes.applicants.Employee;
import com.lee.dedSec.demo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
    @Autowired
    EmployeeRepo repo;

    @PostMapping("/addEmp")
    public void addEmp(@RequestBody Employee employee){
        repo.save(employee);
    }

}
