package com.cg.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.boot.model.Employee;

@RestController
public class EmployeeController {

//	http://localhost:9999/getemp

	@GetMapping("/getemp")
	public Employee getEmp() {
		Employee emp = new Employee(101, "Sonu", 50000);
		System.out.println(emp.toString());
		return emp;
	}
}