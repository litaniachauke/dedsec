package com.lee.dedSec.demo.repository;

import com.lee.dedSec.demo.entity.Employee;
import jakarta.annotation.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Resource
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
