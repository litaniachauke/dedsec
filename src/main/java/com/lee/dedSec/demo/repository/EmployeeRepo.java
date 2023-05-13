package com.lee.dedSec.demo.repository;

import com.lee.dedSec.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
