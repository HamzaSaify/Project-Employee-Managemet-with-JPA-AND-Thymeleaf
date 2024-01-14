package com.employee.EmployeeMangement.Service;

import java.util.List;

import com.employee.EmployeeMangement.Entity.Employees;

public interface EmployeeServ {
	List<Employees> findAll();
	Employees findById(String theID);
	Employees save (Employees theEmployees);
	void deletebyId(String theID);
}
