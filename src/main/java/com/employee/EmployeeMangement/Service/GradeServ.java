package com.employee.EmployeeMangement.Service;

import java.util.List;

//import com.employee.EmployeeMangement.Entity.Department;
import com.employee.EmployeeMangement.Entity.grade;

public interface GradeServ {
	List<grade> findAll();
	grade findById(String theID);
	grade save(grade thegrade);
	void deletebyId(String theID);	
}
