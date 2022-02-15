package com.codeclan.example.employee_relationships_lab;
import com.codeclan.example.employee_relationships_lab.models.Department;
import com.codeclan.example.employee_relationships_lab.models.Employee;
import com.codeclan.example.employee_relationships_lab.models.Project;
import com.codeclan.example.employee_relationships_lab.repositories.DepartmentRepository;
import com.codeclan.example.employee_relationships_lab.repositories.EmployeeRepository;
import com.codeclan.example.employee_relationships_lab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeRelationshipsLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeDepartmentProject() {

		Department department1 = new Department("CodeClan");
		departmentRepository.save(department1);

		Employee employee1 = new Employee("James", "Smith", 665837, department1);
		employeeRepository.save(employee1);

		Employee employee2 = new Employee("Rachel", "Higgins", 822635, department1);
		employeeRepository.save(employee2);

		Employee employee3 = new Employee("Robert", "Chance", 765546, department1);
		employeeRepository.save(employee3);

		Project project1 = new Project("Java stock app", 23);

		Project project2 = new Project("Python weather app", 18);

		project1.addEmployee(employee1);
		project1.addEmployee(employee2);

		projectRepository.save(project1);

		project2.addEmployee(employee2);
		project2.addEmployee(employee3);

		projectRepository.save(project2);

	}

}
