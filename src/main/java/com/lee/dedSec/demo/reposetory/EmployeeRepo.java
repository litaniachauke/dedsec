package com.lee.dedSec.demo.reposetory;

import com.lee.dedSec.demo.classes.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
