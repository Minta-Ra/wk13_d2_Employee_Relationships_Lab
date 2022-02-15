package com.codeclan.example.employee_relationships_lab.controllers;
import com.codeclan.example.employee_relationships_lab.models.Employee;
import com.codeclan.example.employee_relationships_lab.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
