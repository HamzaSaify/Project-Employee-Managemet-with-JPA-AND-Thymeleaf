package com.employee.EmployeeMangement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.EmployeeMangement.DAO.EmployeeDAO;
import com.employee.EmployeeMangement.Entity.Employees;

@Service
public class EmployeeServImpl implements EmployeeServ{
private EmployeeDAO empRep;
	
	@Autowired
	public EmployeeServImpl(EmployeeDAO theEmpRep) {
		empRep=theEmpRep;
	}

	@Override
	public List<Employees> findAll() {
		// TODO Auto-generated method stub
		return empRep.findAll();
	}

	@Override
	public Employees findById(String theID) {
		// TODO Auto-generated method stub
		Optional<Employees> res=empRep.findById(theID);
		Employees theEmp=null;
		if(res.isPresent()) {
			theEmp=res.get();
		}
		return theEmp;
	}

	@Override
	public Employees save(Employees theEmployees) {
		// TODO Auto-generated method stub
		return empRep.save(theEmployees);
	}

	@Override
	public void deletebyId(String theID) {
		// TODO Auto-generated method stub
		empRep.deleteById(theID);
	}
}
