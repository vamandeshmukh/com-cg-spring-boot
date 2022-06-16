package com.cg.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.boot.model.Employee;
import com.cg.spring.boot.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	// http://localhost:9999/get-all-emps
	@GetMapping("/get-all-emps")
	public List<Employee> getAllEmps() {
		List<Employee> eli = empService.getAllEmployees();
		System.out.println(eli);
		return eli;
	}

	// http://localhost:9999/get-emp-by-id/{eid}
	@GetMapping("/get-emp-by-id/{eid}")
	public Employee getEmpById(@PathVariable(name = "eid") int eid) {
		System.out.println(eid);
		return empService.getEmployeeById(eid);
	}

	// http://localhost:9999/get-emp-by-name/{firstName}
	@GetMapping("/get-emp-by-name/{firstName}")
	public List<Employee> getEmpByName(@PathVariable(name = "firstName") String firstName) {
		System.out.println(firstName);
		// please write code here and in service class
		// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
		return empService.getEmployeeByFirstName(firstName);
	}

	// http://localhost:9999/add-emp
	@PostMapping("/add-emp")
	public Employee addEmp(@RequestBody Employee employee) {
		System.out.println(employee.toString());
		return empService.addEmployee(employee);
	}

	// http://localhost:9999/update-emp
	@PutMapping("/update-emp")
	public Employee updateEmp(@RequestBody Employee employee) {
		System.out.println(employee.toString());
		return empService.updateEmployee(employee);
	}

	// http://localhost:9999/delete-emp
	@DeleteMapping("/delete-emp/{eid}")
	public Employee deleteEmp(@PathVariable(name = "eid") int eid) {
		System.out.println(eid);
		return empService.deleteEmployee(eid);
	}
}

//package com.cg.spring.boot.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cg.spring.boot.model.Employee;
//import com.cg.spring.boot.service.EmployeeService;
//
//@RestController
//public class EmployeeController {
//
////	EmployeeService empService = new EmployeeService();
//
//	@Autowired
//	private EmployeeService empService;
//
//	// http://localhost:9999/get-emp-by-id
//
//	@GetMapping("/get-emp-by-id")
//	public Employee getEmpById() {
//		int eid = 101;
//		Employee emp = empService.getEmployeeById(eid);
//		System.out.println(emp.toString());
//		return emp;
//	}
//
//	// http://localhost:9999/get-all-emps
//
//	@GetMapping("/get-all-emps")
//	public List<Employee> getAllEmps() {
//		List<Employee> eli = empService.getAllEmployees();
//		System.out.println(eli);
//		return eli;
//	}
//
//}
