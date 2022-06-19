package com.cg.spring.boot.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

	Logger LOG = LoggerFactory.getLogger(this.getClass());

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Object> handleEmployeeNotFoundException(EmployeeNotFoundException e) {
		String exceptionMessage = e.getMessage();
		LOG.error(exceptionMessage);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Messsage", exceptionMessage);
		ResponseEntity<Object> response = new ResponseEntity<>(null, headers, HttpStatus.NOT_FOUND);
		return response;
	}

	// declare other exception handlers

}
