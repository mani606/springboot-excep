package com.spring.employee.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.employee.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{


}


