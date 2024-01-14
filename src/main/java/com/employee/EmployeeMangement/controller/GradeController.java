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

import com.employee.EmployeeMangement.Entity.grade;
import com.employee.EmployeeMangement.Service.GradeServ;
@Controller
@RequestMapping("/grades")
public class GradeController {
private GradeServ grdServ;
@Autowired
public GradeController (GradeServ theGradeServ) {
	grdServ=theGradeServ;
}

@GetMapping("/list")
public String list(Model theModel)
{
	 List<grade> theEmp =grdServ.findAll();
	  
	  theModel.addAttribute("grades",theEmp);
	 		return "Grade/grade-list";
}
  @GetMapping("/showAddForm")
    public String showFormForAdd(Model theModel) {
	  grade employee = new grade();
        theModel.addAttribute("grades", employee);
        return "Grade/grade-form";
    }
  
  

@PostMapping("/save")
public String saveStud(@ModelAttribute("grades") grade theStud) {
	grdServ.save(theStud);
return"redirect:/grades/list";
}


@GetMapping("/showUpdFrm")
public String showUpdFrm(@RequestParam("stID") String theID,Model theModel) {
grade theStud=grdServ.findById(theID);
theModel.addAttribute("grades",theStud);
return "Grade/grade-form";
}


@GetMapping("/delete")
public String delete(@RequestParam("stID") String theID) {
	grdServ.deletebyId(theID);
return"redirect:/grades/list"; 

}


  




}
