package com.cg.spring.boot.exception;

public class DepartmentNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 106023461980066492L;

	public DepartmentNotFoundException() {
		super();
	}

	public DepartmentNotFoundException(String message) {
		super(message);
	}
}
