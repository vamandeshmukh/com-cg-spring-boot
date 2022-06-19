package com.cg.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.boot.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
