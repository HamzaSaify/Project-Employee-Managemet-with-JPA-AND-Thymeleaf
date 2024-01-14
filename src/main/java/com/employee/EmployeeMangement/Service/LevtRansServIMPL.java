package com.employee.EmployeeMangement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.EmployeeMangement.DAO.LevTransDAO;
import com.employee.EmployeeMangement.Entity.Levtrans;
//import com.employee.EmployeeMangement.Entity.grade;
@Service
public class LevtRansServIMPL implements LevTransServ{
private LevTransDAO theLevRep;
@Autowired
public LevtRansServIMPL(LevTransDAO theLevTransDAO) {
	theLevRep=theLevTransDAO;
}
@Override
public List<Levtrans> findAll() {
	// TODO Auto-generated method stub
	return theLevRep.findAll();
}
@Override
public Levtrans findById(String theID) {
	// TODO Auto-generated method stub
	Optional<Levtrans> res=theLevRep.findById(theID);
	Levtrans theEmp=null;
	if(res.isPresent()) {
		theEmp=res.get();
	}
	return theEmp;
}
@Override
public Levtrans save(Levtrans thegrade) {
	// TODO Auto-generated method stub
	return theLevRep.save(thegrade);
}
@Override
public void deletebyId(String theID) {
	// TODO Auto-generated method stub
	theLevRep.deleteById(theID);
}
}
