package com.spring.employee.exception;

public class EmployeeException extends RuntimeException{
	
	private String errorMessage;
	
	
	public String getErrorMessage() {
		return errorMessage;
	}


	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


	public EmployeeException(String errorMessage) {
		super(errorMessage);
		
	}

}
