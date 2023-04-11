package com.example;

import java.util.List;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

/**
 * Employee project
 *
 */
public class App {
	public static void main(String[] args) {
		Employee e1 = new Employee(10, "Tanusree", 20000);
		Employee e2 = new Employee(20, "Sayan", 21000);
		Employee e3 = new Employee(30, "Akash", 22000);
		Employee e[] = { e1, e2, e3 };

		List<Employee> lemp = EmployeeService.createEmployee(e);
		EmployeeService.displayEmployee(lemp);

	}
}
