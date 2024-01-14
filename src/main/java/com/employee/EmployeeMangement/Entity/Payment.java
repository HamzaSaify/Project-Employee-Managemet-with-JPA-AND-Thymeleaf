package com.employee.EmployeeMangement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payment")
public class Payment {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="payID")
private int payId;

@Column(name="slbID")
private int slbID;

@Column(name="deduction")
private int deduction;

@Column(name="month")
private String month;

@Column(name="empID")
private int empId;

@Column(name="deptID")
private int deptId;


@Column(name="grID")
private int grId;


public Payment() {
	super();
	// TODO Auto-generated constructor stub
}


public Payment(int payId, int slbID, int deduction, String month, int empId, int deptId, int grId) {
	super();
	this.payId = payId;
	this.slbID = slbID;
	this.deduction = deduction;
	this.month = month;
	this.empId = empId;
	this.deptId = deptId;
	this.grId = grId;
}


public int  getPayId() {
	return payId;
}


public void setPayId(int payId) {
	this.payId = payId;
}


public int getSlbID() {
	return slbID;
}


public void setSlbID(int slbID) {
	this.slbID = slbID;
}


public int getDeduction() {
	return deduction;
}


public void setDeduction(int deduction) {
	this.deduction = deduction;
}


public String getMonth() {
	return month;
}


public void setMonth(String month) {
	this.month = month;
}


public int getEmpId() {
	return empId;
}


public void setEmpId(int empId) {
	this.empId = empId;
}


public int getDeptId() {
	return deptId;
}


public void setDeptId(int deptId) {
	this.deptId = deptId;
}


public int getGrId() {
	return grId;
}


public void setGrId(int grId) {
	this.grId = grId;
}


@Override
public String toString() {
	return "Payment [payId=" + payId + ", slbID=" + slbID + ", deduction=" + deduction + ", month=" + month + ", empId="
			+ empId + ", deptId=" + deptId + ", grId=" + grId + "]";
}




	
	
	
}
