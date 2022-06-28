package com.cg.spring.boot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

import com.cg.spring.boot.controller.EmployeeController;
import com.cg.spring.boot.model.Employee;
import com.cg.spring.boot.service.EmployeeService;

@SpringBootTest
public class EmployeeControllerTestsWithMockito {

	@Autowired
	EmployeeController empController;

	@MockBean
	EmployeeService empService;

	@Test
	public void testGetEmpById() {

		when(empService.getEmployeeById(3)).thenReturn(new Employee(3, "Pooja", 50000));

		assertEquals(3, empController.getEmpById(3).getBody().getEid());
	}

	@Test
	public void testGetEmpById2() {
		when(empService.getEmployeeById(3)).thenReturn(new Employee(3, "Pooja", 50000));
		assertEquals(HttpStatus.OK, empController.getEmpById(3).getStatusCode());
	}

}
