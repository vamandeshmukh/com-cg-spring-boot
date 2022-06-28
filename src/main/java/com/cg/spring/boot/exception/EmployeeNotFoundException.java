package com.cg.spring.boot.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -8797621019825746776L;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	public EmployeeNotFoundException() {
		super();
	}

	public EmployeeNotFoundException(String message) {
		super(message);
		LOG.info(message);
	}
}

//package com.cg.spring.boot.exception;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//public class EmployeeNotFoundException extends RuntimeException {
//
//	public EmployeeNotFoundException() {
//		super();
//	}
//
//	public EmployeeNotFoundException(String message) {
//		super(message);
//	}
//
//}
