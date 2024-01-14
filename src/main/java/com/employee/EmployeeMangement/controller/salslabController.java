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

import com.employee.EmployeeMangement.Entity.salslab;
import com.employee.EmployeeMangement.Service.salslabServ;
@Controller
@RequestMapping("/salslabs")
public class salslabController {
private salslabServ salrep;
@Autowired
public salslabController (salslabServ thesalslabServ) {
	salrep=thesalslabServ;
}
@GetMapping("/list")
public String list(Model theModel)
{
	 List<salslab> theEmp =salrep.findAll();
	  
	  theModel.addAttribute("salslabs",theEmp);
	 		return "Salslab/list-Salslab";
}
  @GetMapping("/showAddForm")
    public String showFormForAdd(Model theModel) {
	  salslab employee = new salslab();
        theModel.addAttribute("salslabs", employee);
        return "Salslab/salslab-from";
    }
  
  

@PostMapping("/save")
public String saveStud(@ModelAttribute("salslabs") salslab theStud) {
	salrep.save(theStud);
return"redirect:/salslabs/list";
}


@GetMapping("/showUpdFrm")
public String showUpdFrm(@RequestParam("stID") String theID,Model theModel) {
	salslab theStud=salrep.findById(theID);
theModel.addAttribute("salslabs",theStud);
return "Salslab/salslab-from";
}


@GetMapping("/delete")
public String delete(@RequestParam("stID") String theID) {
	salrep.deletebyId(theID);
return"redirect:/salslabs/list"; 

}
}
