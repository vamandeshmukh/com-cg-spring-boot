package com.cg.spring.boot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.boot.model.Employee;
import com.cg.spring.boot.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	// Use ResponseEntity to all the methods in controller classes.

	@Autowired
	private EmployeeService empService;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	// http://localhost:9999/emp/get-all-emps
	@GetMapping("/get-all-emps")
	public ResponseEntity<List<Employee>> getAllEmps() {
		List<Employee> empList = empService.getAllEmployees();
		for (Employee empTemp : empList)
			LOG.info(empTemp.toString());
		HttpStatus status = HttpStatus.OK;
		ResponseEntity<List<Employee>> response = new ResponseEntity<>(empList, status);
		return response;
	}

	// http://localhost:9999/emp/get-emp-by-id/{eid}
	@GetMapping("/get-emp-by-id/{eid}")
	public ResponseEntity<Employee> getEmpById(@PathVariable(name = "eid") int eid) {
		LOG.info(Integer.toString(eid));
		Employee emp = empService.getEmployeeById(eid);
		HttpStatus status = HttpStatus.OK;
		ResponseEntity<Employee> response = new ResponseEntity<>(emp, status);
		return response;
	}

	// http://localhost:9999/emp/get-emp-by-name/{firstName}
	@GetMapping("/get-emp-by-name/{firstName}")
	public ResponseEntity<List<Employee>> getEmpByName(@PathVariable(name = "firstName") String firstName) {
		LOG.info(firstName);
		HttpStatus status = HttpStatus.OK;
		ResponseEntity<List<Employee>> response = new ResponseEntity<>(empService.getEmployeeByFirstName(firstName),
				status);
		return response;
	}

	// http://localhost:9999/emp/add-emp
	@PostMapping("/add-emp")
	public ResponseEntity<Employee> addEmp(@RequestBody Employee employee) {
		LOG.info(employee.toString());
		HttpStatus status = HttpStatus.OK;
		ResponseEntity<Employee> response = new ResponseEntity<>(empService.addEmployee(employee), status);
		return response;
	}

	// http://localhost:9999/emp/update-emp
	@PutMapping("/update-emp")
	public ResponseEntity<Employee> updateEmp(@RequestBody Employee employee) {
		LOG.info(employee.toString());
		HttpStatus status = HttpStatus.OK;
		ResponseEntity<Employee> response = new ResponseEntity<>(empService.updateEmployee(employee), status);
		return response;
	}

	// http://localhost:9999/emp/delete-emp
	@DeleteMapping("/delete-emp/{eid}")
	public ResponseEntity<Employee> deleteEmp(@PathVariable(name = "eid") int eid) {
		LOG.info(Integer.toString(eid));
		HttpStatus status = HttpStatus.OK;
		ResponseEntity<Employee> response = new ResponseEntity<>(empService.deleteEmployee(eid), status);
		return response;
	}
}

//package com.cg.spring.boot.controller;
//
//import java.util.List;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cg.spring.boot.model.Employee;
//import com.cg.spring.boot.service.EmployeeService;
//
//@RestController
//public class EmployeeController {
//
//	@Autowired
//	private EmployeeService empService;
//
//	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
//
//	// http://localhost:9999/get-all-emps
//	@GetMapping("/get-all-emps")
//	public List<Employee> getAllEmps() {
//		List<Employee> empList = empService.getAllEmployees();
//		for (Employee empTemp : empList)
//			LOG.info(empTemp.toString());
//		return empList;
//	}
//
//	// http://localhost:9999/get-emp-by-id/{eid}
//	@GetMapping("/get-emp-by-id/{eid}")
//	public Employee getEmpById(@PathVariable(name = "eid") int eid) {
//		LOG.info(Integer.toString(eid));
//		return empService.getEmployeeById(eid);
//	}
//
//	// http://localhost:9999/get-emp-by-name/{firstName}
//	@GetMapping("/get-emp-by-name/{firstName}")
//	public List<Employee> getEmpByName(@PathVariable(name = "firstName") String firstName) {
//		LOG.info(firstName);
//		return empService.getEmployeeByFirstName(firstName);
//	}
//
//	// http://localhost:9999/add-emp
//	@PostMapping("/add-emp")
//	public Employee addEmp(@RequestBody Employee employee) {
//		LOG.info(employee.toString());
//		return empService.addEmployee(employee);
//	}
//
//	// http://localhost:9999/update-emp
//	@PutMapping("/update-emp")
//	public Employee updateEmp(@RequestBody Employee employee) {
//		LOG.info(employee.toString());
//		return empService.updateEmployee(employee);
//	}
//
//	// http://localhost:9999/delete-emp
//	@DeleteMapping("/delete-emp/{eid}")
//	public Employee deleteEmp(@PathVariable(name = "eid") int eid) {
//		LOG.info(Integer.toString(eid));
//		return empService.deleteEmployee(eid);
//	}
//}

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
