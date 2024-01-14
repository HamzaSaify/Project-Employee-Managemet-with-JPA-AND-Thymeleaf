package com.employee.EmployeeMangement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.employee.EmployeeMangement.Entity.Employees;
import com.employee.EmployeeMangement.Service.EmployeeServ;

@Controller
@RequestMapping("/employees")
public class employeecontroller {
	
	private EmployeeServ empServ;
	@Autowired
	public employeecontroller(EmployeeServ theEmployeeService) {
	 empServ= theEmployeeService;
		}
	
	@GetMapping("/list")
	public String list(Model theModel)
	{
 	 List<Employees> theEmp =empServ.findAll();
		  
		  theModel.addAttribute("employees",theEmp);
		 		return "employee/list-empl";
	}
	  @GetMapping("/showAddForm")
	    public String showFormForAdd(Model theModel) {
	        Employees employee = new Employees();
	        theModel.addAttribute("employees", employee);
	        return "employee/employee-form";
	    }
	  
	  

@PostMapping("/save")
public String saveStud(@ModelAttribute("employees") Employees theStud) {
	empServ.save(theStud);
	return"redirect:/employees/list";
}


@GetMapping("/showUpdFrm")
public String showUpdFrm(@RequestParam("stID") String theID,Model theModel) {
	Employees theStud=empServ.findById(theID);
	theModel.addAttribute("employees",theStud);
	return "employee/employee-form";
}


@GetMapping("/delete")
public String delete(@RequestParam("stID") String theID) {
	empServ.deletebyId(theID);
	return"redirect:/employees/list"; 

}


	  
	  
	
}