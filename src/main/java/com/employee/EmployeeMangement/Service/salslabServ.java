package com.employee.EmployeeMangement.Service;

import java.util.List;

import com.employee.EmployeeMangement.Entity.salslab;

public interface salslabServ {
	List<salslab> findAll();
	salslab findById(String theID);
	salslab save(salslab thesalslab);
	void deletebyId(String theID);	
}
