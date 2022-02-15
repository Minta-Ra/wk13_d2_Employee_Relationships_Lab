package com.codeclan.example.employee_relationships_lab.repositories;
import com.codeclan.example.employee_relationships_lab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
