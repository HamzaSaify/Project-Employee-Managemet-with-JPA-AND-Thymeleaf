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

//import com.employee.EmployeeMangement.Entity.Leaves;
import com.employee.EmployeeMangement.Entity.Levtrans;
import com.employee.EmployeeMangement.Service.LevTransServ;
@Controller
@RequestMapping("/levTranss")
public class LevTransController {
	private LevTransServ LevRep;
	@Autowired
	public LevTransController (LevTransServ theLevTransServ)
	{
		LevRep=theLevTransServ; 
	}
	
	@GetMapping("/list")
	public String list(Model theModel)
	{
 	 List<Levtrans> theEmp =LevRep.findAll();
		  
		  theModel.addAttribute("levTranss",theEmp);
		 		return "LevTrans/list-levTrans";
	}
	  @GetMapping("/showAddForm")
	    public String showFormForAdd(Model theModel) {
		  Levtrans employee = new Levtrans();
	        theModel.addAttribute("levTranss", employee);
	        return "LevTrans/levTrans-form";
	    }
	  
	  

@PostMapping("/save")
public String saveStud(@ModelAttribute("levTranss") Levtrans theStud) {
	LevRep.save(theStud);
	return"redirect:/levTranss/list";
}


@GetMapping("/showUpdFrm")
public String showUpdFrm(@RequestParam("stID") String theID,Model theModel) {
	Levtrans theStud=LevRep.findById(theID);
	theModel.addAttribute("levTranss",theStud);
	return "LevTrans/levTrans-form";
}


@GetMapping("/delete")
public String delete(@RequestParam("stID") String theID) {
	LevRep.deletebyId(theID);
	return"redirect:/levTranss/list"; 

}


	  
}
