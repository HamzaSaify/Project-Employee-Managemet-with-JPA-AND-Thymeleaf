package com.employee.EmployeeMangement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.employee.EmployeeMangement.DAO.GradeDAO;
//import com.employee.EmployeeMangement.Entity.Employees;
import com.employee.EmployeeMangement.Entity.grade;
@Service
public class GradeServImpl implements GradeServ {
	private GradeDAO grdRep;
	public GradeServImpl(GradeDAO thegrade) {
		grdRep=thegrade;
	}
	@Override
	public List<grade> findAll() {
		// TODO Auto-generated method stub
		return grdRep.findAll();
	}
	@Override
	public grade findById(String theID) {
		// TODO Auto-generated method stub
		Optional<grade> res=grdRep.findById(theID);
		grade theEmp=null;
		if(res.isPresent()) {
			theEmp=res.get();
		}
		return theEmp;
	}
	@Override
	public grade save(grade thegrade) {
		// TODO Auto-generated method stub
		return grdRep.save(thegrade);
	}
	@Override
	public void deletebyId(String theID) {
		// TODO Auto-generated method stub
		grdRep.deleteById(theID);
	}
}
