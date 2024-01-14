package com.employee.EmployeeMangement.Service;

import java.util.List;

import com.employee.EmployeeMangement.Entity.Levtrans;

public interface LevTransServ {

	List<Levtrans> findAll();
	Levtrans findById(String theID);
	Levtrans save(Levtrans thegrade);
	void deletebyId(String theID);	

}
