package com.spring.employee.service;

	import org.springframework.stereotype.Component;

import com.spring.employee.model.Employee;

	
	@Component
	public class EmployeeService {
		
		public Employee saveEmployee(Employee emp) {
			emp.setId(emp.getId()+1);
			return emp;
		}
		

	}


