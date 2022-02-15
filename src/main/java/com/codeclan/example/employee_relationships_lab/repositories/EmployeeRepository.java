package com.codeclan.example.employee_relationships_lab.repositories;
import com.codeclan.example.employee_relationships_lab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
