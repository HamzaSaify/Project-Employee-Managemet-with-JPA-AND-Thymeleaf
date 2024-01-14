package com.employee.EmployeeMangement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.EmployeeMangement.DAO.DepartmentDAO;
import com.employee.EmployeeMangement.Entity.Department;
//import com.employee.EmployeeMangement.Entity.Employees;
@Service
public class DepartmentServimpl implements Departmentserv{
	private DepartmentDAO deptRep;	
	@Autowired	
	public DepartmentServimpl(DepartmentDAO theDEPRep) {
		deptRep=theDEPRep;
	}
	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return deptRep.findAll();
	}

	@Override
	public Department findById(String theID) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Optional<Department> res=deptRep.findById(theID);
		Department theEmp=null;
		if(res.isPresent()) {
			theEmp=res.get();
		}
		return theEmp;
	}

	@Override
	public Department save(Department theDepartment) {
		// TODO Auto-generated method stub
		return deptRep.save(theDepartment);
	}

	@Override
	public void deletebyId(String theID) {
		// TODO Auto-generated method stub
		deptRep.deleteById(theID);
	}



}
