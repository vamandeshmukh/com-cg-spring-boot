package com.cg.spring.boot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.boot.model.Department;
import com.cg.spring.boot.service.DepartmentService;

@RestController
@RequestMapping("/dep")
@CrossOrigin(origins = "*")
public class DepartmentController {

	@Autowired
	DepartmentService depService;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	// http://localhost:9999/dep/get-all-deps
	@GetMapping("/get-all-deps")
	public ResponseEntity<List<Department>> getAllDeps() {
		List<Department> depList = depService.getAllDepartments();
		for (Department dep : depList)
			LOG.info(dep.toString());
		HttpStatus status = HttpStatus.OK;
		ResponseEntity<List<Department>> response = new ResponseEntity<>(depList, status);
		return response;
	}

	// http://localhost:9999/dep/get-dep-by-id/{did}
	@GetMapping("/get-dep-by-id/{did}")
	public ResponseEntity<Department> getDepById(@PathVariable(name = "did") int did) {
		LOG.info(Integer.toString(did));
		Department dep = depService.getDepartmentById(did);
		HttpStatus status = HttpStatus.OK;
		ResponseEntity<Department> response = new ResponseEntity<>(dep, status);
		return response;
	}

	// http://localhost:9999/dep/add-dep
	@PostMapping("/add-dep")
	public Department addEmp(@RequestBody Department department) {
		LOG.info(department.toString());
		return depService.addDepartment(department);
	}

}
