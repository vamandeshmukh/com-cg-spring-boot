package com.cg.spring.boot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.spring.boot.controller.EmployeeController;

@SpringBootTest
public class EmployeeControllerTests {

	@Autowired
	EmployeeController empController;

	@Test
	public void testGetEmpById() {
		assertEquals(3, empController.getEmpById(3).getBody().getEid());
	}

	@Test
	public void testGetEmpById2() {
		assertNotEquals(3, empController.getEmpById(4));
	}
}
