package com.lee.dedSec.demo.repo;

import com.lee.dedSec.demo.classes.applicants.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
