package com.cg.spring.boot.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.boot.exception.EmployeeNotFoundException;
import com.cg.spring.boot.model.Employee;
import com.cg.spring.boot.repository.DepartmentRepository;
import com.cg.spring.boot.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository empRepository;

	@Autowired
	DepartmentRepository depRepository;

	@Autowired
	DepartmentService depService;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	public List<Employee> getAllEmployees() {
		LOG.info("getAllEmployees");
		return empRepository.findAll();
	}

	public Employee getEmployeeById(int eid) { // 2
		Optional<Employee> empOptional = empRepository.findById(eid);

		Employee emp = null;
		if (empOptional.isPresent()) {
			emp = empOptional.get();
			LOG.info(emp.toString());
			return emp;
		} else {
			String errorMessage = "Employee with eid " + eid + " does not exist.";
			LOG.error(errorMessage);
			throw new EmployeeNotFoundException(errorMessage);
//			throw new EmployeeNotFoundException();
		}
	}

	public List<Employee> getEmployeeByFirstName(String firstName) {
		LOG.info(firstName);
		List<Employee> empList = empRepository.findByFirstNameIgnoreCase(firstName);
		if (null != empList)
			return empList;
		String errorMessage = "Employee with firstName " + firstName + " does not exist.";
		throw new EmployeeNotFoundException(errorMessage);
	}

	public Employee addEmployee(Employee employee) {
		LOG.info(employee.toString());
		if (employee.getDepartment() != null)
			depService.getDepartmentById(employee.getDepartment().getDid());
		return empRepository.save(employee);
	}

	public Employee updateEmployee(Employee employee) {
		LOG.info(employee.toString());
		this.getEmployeeById(employee.getEid());
		return empRepository.save(employee);
	}

	public Employee deleteEmployee(int eid) { // 1 2 3 4 5 , 6
		LOG.info(Integer.toString(eid));
		Employee empToDelete = this.getEmployeeById(eid);
		empRepository.delete(empToDelete);
		return empToDelete;
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
//	List<Employee> empList = new ArrayList<>();
//
//	// non static block
//	{
//		empList.add(new Employee(101, "Sonu", 50000));
//		empList.add(new Employee(102, "Monu", 75000));
//		empList.add(new Employee(103, "Tonu", 60000));
//	}
//
//	public List<Employee> getAllEmployees() {
//		return empList;
//	}
//
//	public Employee getEmployeeById(int eid) {
//		Employee emp = null;
//		for (Employee e : empList) {
//			if (e.getEid() == eid) {
//				emp = e;
//			}
//		}
//		System.out.println(emp.toString());
//		return emp;
//	}
//
//	public Employee addEmployee(Employee employee) {
//		empList.add(employee);
//		return employee;
//	}
//
//	public Employee updateEmployee(Employee employee) {
//		for (Employee e : empList) {
//			if (e.getEid() == employee.getEid()) {
//				empList.set(empList.indexOf(e), employee);
//			}
//		}
//		return employee;
//	}
//
//	public Employee deleteEmployee(int eid) {
//		Employee emp = null;
//		for (Employee e : empList) {
//			if (e.getEid() == eid) {
//				emp = e;
//			}
//		}
//		empList.remove(emp);
//		System.out.println("Employee deleted successfully.");
//		return emp;
//	}
//
//}

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