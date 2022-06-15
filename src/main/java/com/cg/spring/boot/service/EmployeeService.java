package com.cg.spring.boot.service;

import org.springframework.stereotype.Service;

import com.cg.spring.boot.model.Employee;

@Service
public class EmployeeService {

	public Employee getEmployeeById(int eid) {

		Employee emp = new Employee(eid, "Sonu", 60000);
		System.out.println(emp.toString());
		return emp;
	}

}
