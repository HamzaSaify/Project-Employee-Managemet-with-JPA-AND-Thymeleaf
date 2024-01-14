package com.employee.EmployeeMangement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.employee.EmployeeMangement.Entity.Employees;
import com.employee.EmployeeMangement.Service.EmployeeServ;


@Controller
public class DemoContoller {
	private EmployeeServ empServ;
//	private GradeServ grdServ;
	
	@Autowired
	public DemoContoller(EmployeeServ empServ) {
		super();
		this.empServ = empServ;
	}
	
	@GetMapping("/new")
	public String list() {
		return "new";
	}
	
	

	@GetMapping("/mainPage")
	public String show() {
		return "mainPage";
	}
	
	@GetMapping("/empPage")
	public String card() {
		return "Employee/empCard";
	}
	
	@GetMapping("/reporting")
	public String fetch(Model theModel) {
		List<Employees> theEmp =empServ.findAll();
		  
		  theModel.addAttribute("employee",theEmp);
		return "reporting";
	}
}