package com.cg.spring.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.boot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

//  no need to write methods for 
//	- findAll(); - select 
//	- findById(); - select 
//  - save(); - insert 
//	- save(): - update 
//	- delete(); - delete 

//	you need to write methods for other operations 
//	check this documentation - 
//	https://docs.spring.io/spring-data/jpa/docs/current/reference/html/

//	sytax - 
//	public abstract List<ClassName> findByFieldName(that field type and name);

	public abstract List<Employee> findByFirstName(String firstName);

}
