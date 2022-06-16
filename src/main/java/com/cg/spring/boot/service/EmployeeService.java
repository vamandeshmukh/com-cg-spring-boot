package com.cg.spring.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.spring.boot.model.Employee;

@Service
public class EmployeeService {

	List<Employee> empList = new ArrayList<>();

	// non static block
	{
		empList.add(new Employee(101, "Sonu", 50000));
		empList.add(new Employee(102, "Monu", 75000));
		empList.add(new Employee(103, "Tonu", 60000));
	}

	public List<Employee> getAllEmployees() {
		return empList;
	}

	public Employee getEmployeeById(int eid) {
		Employee emp = null;
		// code
		return emp;
	}

	public Employee addEmployee(Employee employee) {
		empList.add(employee);
		return employee;
	}

	public Employee updateEmployee(Employee employee) {
		// code
	}

}

//package com.cg.spring.boot.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import com.cg.spring.boot.model.Employee;
//
//@Service
//public class EmployeeService {
//
//	public Employee getEmployeeById(int eid) {
//
//		Employee emp = new Employee(eid, "Sonu", 60000);
//		System.out.println(emp.toString());
//		return emp;
//	}
//
//	public List<Employee> getAllEmployees() {
//		List<Employee> empList = new ArrayList<>();
//		empList.add(new Employee(101, "Sonu", 50000));
//		empList.add(new Employee(102, "Monu", 75000));
//		empList.add(new Employee(103, "Tonu", 60000));
//		return empList;
//	}
//
//}