package com.employee.EmployeeMangement.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.EmployeeMangement.Entity.Employees;

public interface EmployeeDAO extends JpaRepository<Employees, String>{
	

}
