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

//import com.employee.EmployeeMangement.Entity.Levtrans;
import com.employee.EmployeeMangement.Entity.Payment;
import com.employee.EmployeeMangement.Service.PaymentServimpl;
@Controller
@RequestMapping("/payments")
public class PaymentController {
	private PaymentServimpl thePay;
	@Autowired
	public PaymentController (PaymentServimpl thePaymentServimpl) {
		thePay=thePaymentServimpl;
	}
	@GetMapping("/list")
	public String list(Model theModel)
	{
 	 List<Payment> theEmp =thePay.findAll();
		  
		  theModel.addAttribute("payments",theEmp);
		 		return "Payment/list-Payment";
	}
	  @GetMapping("/showAddForm")
	    public String showFormForAdd(Model theModel) {
		  Payment employee = new Payment();
	        theModel.addAttribute("payments", employee);
	        return "Payment/Payment-form";
	    }
	  
	  

@PostMapping("/save")
public String saveStud(@ModelAttribute("payments") Payment theStud) {
	thePay.save(theStud);
	return"redirect:/payments/list";
}


@GetMapping("/showUpdFrm")
public String showUpdFrm(@RequestParam("stID") String theID,Model theModel) {
	Payment theStud=thePay.findById(theID);
	theModel.addAttribute("payments",theStud);
	return "Payment/Payment-form";
}


@GetMapping("/delete")
public String delete(@RequestParam("stID") String theID) {
	thePay.deletebyId(theID);
	return"redirect:/payments/list"; 

}
}
