package com.codeclan.example.employee_relationships_lab;
import com.codeclan.example.employee_relationships_lab.models.Department;
import com.codeclan.example.employee_relationships_lab.models.Employee;
import com.codeclan.example.employee_relationships_lab.repositories.DepartmentRepository;
import com.codeclan.example.employee_relationships_lab.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeRelationshipsLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment() {

		Department department1 = new Department("CodeClan");
		departmentRepository.save(department1);

		Employee employee1 = new Employee("James", "Smith", 665837, department1);
		employeeRepository.save(employee1);

		Employee employee2 = new Employee("Rachel", "Higgins", 822635, department1);
		employeeRepository.save(employee2);

	}

}
