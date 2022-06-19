package com.cg.spring.boot.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.boot.exception.DepartmentNotFoundException;
import com.cg.spring.boot.model.Department;
import com.cg.spring.boot.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository depRepository;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	public List<Department> getAllDepartments() {
		LOG.info("getAllDepartments");
		return depRepository.findAll();
	}

	public Department getDepartmentById(int did) {
		Optional<Department> depOptional = depRepository.findById(did);
		Department dep = null;
		if (depOptional.isPresent()) {
			dep = depOptional.get();
			LOG.info(dep.toString());
			return dep;
		} else {
			String errorMessage = "Department with did " + did + " does not exist.";
			LOG.error(errorMessage);
			throw new DepartmentNotFoundException(errorMessage);
		}
	}

	public Department addDepartment(Department department) {
		LOG.info(department.toString());
		return depRepository.save(department);
	}

}
