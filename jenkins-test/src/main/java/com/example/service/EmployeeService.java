package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.Employee;

public class EmployeeService {
	private static List<Employee> elist = new ArrayList<>();

	public static List<Employee> createEmployee(Employee[] e) {
		for (int i = 0; i < e.length; i++) {
			elist.add(e[i]);
		}

		return elist;
	}

	public static void displayEmployee(List<Employee> el) {
		for (Employee e : el)
			System.out.println(e.getId() + " " + e.getName() + " " + e.getSal());
	}

}
