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

import com.employee.EmployeeMangement.Entity.Leaves;
import com.employee.EmployeeMangement.Service.LeavesServ;

@Controller
@RequestMapping("/leavess")
public class LeavesController {
	
	private LeavesServ empServ;
	@Autowired
	public LeavesController(LeavesServ theEmployeeService) {
	 empServ= theEmployeeService;
		}
	
	@GetMapping("/list")
	public String list(Model theModel)
	{
 	 List<Leaves> theEmp =empServ.findAll();
		  
		  theModel.addAttribute("leavess",theEmp);
		 		return "Leave/list-leave";
	}
	  @GetMapping("/showAddForm")
	    public String showFormForAdd(Model theModel) {
	        Leaves employee = new Leaves();
	        theModel.addAttribute("leavess", employee);
	        return "Leave/leave-form";
	    }
	  
	  

@PostMapping("/save")
public String saveStud(@ModelAttribute("leavess") Leaves theStud) {
	empServ.save(theStud);
	return"redirect:/leavess/list";
}


@GetMapping("/showUpdFrm")
public String showUpdFrm(@RequestParam("stID") String theID,Model theModel) {
	Leaves theStud=empServ.findById(theID);
	theModel.addAttribute("leavess",theStud);
	return "Leave/leave-form";
}


@GetMapping("/delete")
public String delete(@RequestParam("stID") String theID) {
	empServ.deletebyId(theID);
	return"redirect:/leavess/list"; 

}


	  
	  
	
}