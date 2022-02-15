package com.codeclan.example.employee_relationships_lab.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "project_name")
    private String name;

    @Column(name = "duration_num_of_days")
    private int duration_num_of_days;

    @ManyToMany
    @JsonIgnoreProperties({"projects"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "employees_projects",
            joinColumns = { @JoinColumn(
                    name = "project_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = { @JoinColumn(
                    name = "employee_id",
                    nullable = false,
                    updatable = false)
            }
    )
    // be able to add multiple employees
    private List<Employee> employees;


    public Project(String name, int duration_num_of_days) {
        this.name = name;
        this.duration_num_of_days = duration_num_of_days;
        this.employees = new ArrayList<Employee>();
    }

    public Project() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration_num_of_days() {
        return duration_num_of_days;
    }

    public void setDuration_num_of_days(int duration_num_of_days) {
        this.duration_num_of_days = duration_num_of_days;
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }
}
