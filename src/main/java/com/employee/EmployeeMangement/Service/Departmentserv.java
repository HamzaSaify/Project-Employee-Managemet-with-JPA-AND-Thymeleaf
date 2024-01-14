package com.employee.EmployeeMangement.Service;

import java.util.List;

import com.employee.EmployeeMangement.Entity.Department;

public interface Departmentserv {
	List<Department> findAll();
	Department findById(String theID);
	Department save(Department theDepartment);
	void deletebyId(String theID);	
}
