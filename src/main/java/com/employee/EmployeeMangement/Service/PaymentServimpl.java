package com.employee.EmployeeMangement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.EmployeeMangement.DAO.PaymentDAO;
import com.employee.EmployeeMangement.Entity.Payment;
//import com.employee.EmployeeMangement.Entity.salslab;
@Service
public class PaymentServimpl implements PaymentServ {
	private PaymentDAO payRep;
	@Autowired
	public PaymentServimpl(PaymentDAO thePaymentDAO){
		payRep=thePaymentDAO;
	}
	@Override
	public List<Payment> findAll() {
		// TODO Auto-generated method stub
		return payRep.findAll();
	}

	@Override
	public Payment findById(String theID) {
		// TODO Auto-generated method stub
		Optional<Payment> res=payRep.findById(theID);
		Payment theEmp=null;
		if(res.isPresent()) {
			theEmp=res.get();
		}
		return theEmp;
	}

	@Override
	public Payment save(Payment thePayment) {
		// TODO Auto-generated method stub
		return payRep.save(thePayment);
	}

	@Override
	public void deletebyId(String theID) {
		// TODO Auto-generated method stub
		payRep.deleteById(theID);
	}

}
