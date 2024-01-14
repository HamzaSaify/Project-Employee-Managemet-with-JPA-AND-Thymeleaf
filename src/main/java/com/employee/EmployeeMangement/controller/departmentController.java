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

import com.employee.EmployeeMangement.Entity.Department;
//import com.employee.EmployeeMangement.Entity.Employees;
import com.employee.EmployeeMangement.Service.Departmentserv;

@Controller
@RequestMapping("/departments")
public class departmentController {
	
	private Departmentserv deptServ;
	@Autowired
	public departmentController(Departmentserv theDepartmentService) {
	 deptServ= theDepartmentService;
		}
	
	@GetMapping("/list")
	public String list(Model theModel)
	{
 	 List<Department> theEmp =deptServ.findAll();
		  
		  theModel.addAttribute("departments",theEmp);
		 		return "Department/deptPage";
	}
	  @GetMapping("/showAddForm")
	    public String showFormForAdd(Model theModel) {
	        Department department= new Department();
	        theModel.addAttribute("departments", department);
	        return "Department/department-form";
	    }
	  
	  

@PostMapping("/save")
public String saveStud(@ModelAttribute("departments") Department theStud) {
	deptServ.save(theStud);
	return"redirect:/departments/list";
}


@GetMapping("/showUpdFrm")
public String showUpdFrm(@RequestParam("stID") String theID,Model theModel) {
	Department theStud=deptServ.findById(theID);
	theModel.addAttribute("departments",theStud);
	return "Department/department-form";
}


@GetMapping("/delete")
public String delete(@RequestParam("stID") String theID) {
	deptServ.deletebyId(theID);
	return"redirect:/departments/list"; 

}

  
	
}