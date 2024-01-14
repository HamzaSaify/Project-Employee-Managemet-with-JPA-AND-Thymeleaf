package com.employee.EmployeeMangement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.EmployeeMangement.DAO.salslabDAO;
//import com.employee.EmployeeMangement.Entity.Levtrans;
import com.employee.EmployeeMangement.Entity.salslab;
@Service
public class salslabServimpl implements salslabServ{
	private salslabDAO salRep;
	@Autowired
	public salslabServimpl(salslabDAO thesalslabDAO) 
	{
		salRep=thesalslabDAO;
	}
	@Override
	public List<salslab> findAll() {
		// TODO Auto-generated method stub
		return salRep.findAll();
	}
	@Override
	public salslab findById(String theID) {
		Optional<salslab> res=salRep.findById(theID);
		salslab theEmp=null;
		if(res.isPresent()) {
			theEmp=res.get();
		}
		return theEmp;
	}
	@Override
	public salslab save(salslab thesalslab) {
		// TODO Auto-generated method stub
		return salRep.save(thesalslab);
	}
	@Override
	public void deletebyId(String theID) {
		// TODO Auto-generated method stub
		salRep.deleteById(theID);
	}

}
