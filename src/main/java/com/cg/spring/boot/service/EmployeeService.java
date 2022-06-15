package com.cg.spring.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.spring.boot.model.Employee;

@Service
public class EmployeeService {

	public Employee getEmployeeById(int eid) {

		Employee emp = new Employee(eid, "Sonu", 60000);
		System.out.println(emp.toString());
		return emp;
	}

	public List<Employee> getAllEmployees() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Sonu", 50000));
		empList.add(new Employee(102, "Monu", 75000));
		empList.add(new Employee(103, "Tonu", 60000));
		return empList;
	}

}
