package com.lee.dedSec.demo.services.implementation;

import com.lee.dedSec.demo.entity.Employee;
import com.lee.dedSec.demo.repository.EmployeeRepo;
import com.lee.dedSec.demo.services.interfaces.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImplementation implements EmployeeService {
    private final EmployeeRepo employeeRepository;
    @Autowired
    public EmployeeServiceImplementation(EmployeeRepo employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void addEmp(Employee employee) {
        employeeRepository.save(employee);
    }
 
    @Override
    public Employee findEmployeeId(Long empId) {

        Employee employee = employeeRepository.findById(empId).orElseThrow(ResourceNotFoundException::new);
        return employee;
    }

    @Override
    public void deleteEmployeeId(Long empId) {
        Employee employee = employeeRepository.findById(empId).orElseThrow(ResourceNotFoundException::new);
        employeeRepository.delete(employee);
    }
    @Override
    public void editEmployee (Employee employee){
       employeeRepository.findAll().stream().filter(e -> e.getEmployeeId()==employee.getEmployeeId()).forEach(e->{
                e.setName(employee.getName());
                e.setPosition(employee.getPosition());
                e.setSurname(employee.getSurname());
               }
       );
        final Employee updatedEmployee = employeeRepository.save(employee);
    }
}
