package com.cg.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.boot.model.Employee;
import com.cg.spring.boot.service.EmployeeService;

@RestController
public class EmployeeController {

//	EmployeeService empService = new EmployeeService();

	@Autowired
	private EmployeeService empService;

	// http://localhost:9999/get-emp-by-id

	@GetMapping("/get-emp-by-id")
	public Employee getEmpById() {
		int eid = 101;
		Employee emp = empService.getEmployeeById(eid);
		System.out.println(emp.toString());
		return emp;
	}

}
