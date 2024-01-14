package com.employee.EmployeeMangement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.EmployeeMangement.DAO.LeavesDAO;
import com.employee.EmployeeMangement.Entity.Leaves;
@Service
public class LeavesServimpl implements LeavesServ {
	private LeavesDAO deptRep;	
	@Autowired	
	public LeavesServimpl(LeavesDAO theDEPRep) {
		deptRep=theDEPRep;
	}
	@Override
	public List<Leaves> findAll() {
		// TODO Auto-generated method stub
		return deptRep.findAll();
	}

	@Override
	public Leaves findById(String theID) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Optional<Leaves> res=deptRep.findById(theID);
		Leaves theEmp=null;
		if(res.isPresent()) {
			theEmp=res.get();
		}
		return theEmp;
	}

	@Override
	public Leaves save(Leaves theLeaves) {
		// TODO Auto-generated method stub
		return deptRep.save(theLeaves);
	}

	@Override
	public void deletebyId(String theID) {
		// TODO Auto-generated method stub
		deptRep.deleteById(theID);
	}


}
