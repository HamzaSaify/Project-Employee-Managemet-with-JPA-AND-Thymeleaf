package com.employee.EmployeeMangement.Service;

import java.util.List;

import com.employee.EmployeeMangement.Entity.Leaves;

public interface LeavesServ {
	List<Leaves> findAll();
	Leaves findById(String theID);
	Leaves save(Leaves theLeaves);
	void deletebyId(String theID);	
}
