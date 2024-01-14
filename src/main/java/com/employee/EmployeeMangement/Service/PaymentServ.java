package com.employee.EmployeeMangement.Service;

import java.util.List;

import com.employee.EmployeeMangement.Entity.Payment;

public interface PaymentServ {
	List<Payment> findAll();
	Payment findById(String theID);
	Payment save(Payment thePayment);
	void deletebyId(String theID);	

}
