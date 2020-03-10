package com.spring.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringbootrestApplication {

	//@Autowired
	//EmployeeRepository employeerepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootrestApplication.class, args);
	}

}
