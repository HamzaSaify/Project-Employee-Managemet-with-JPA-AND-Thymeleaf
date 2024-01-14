package com.employee.EmployeeMangement.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employees {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

@Column(name="empID")
private int empID;

@Column(name="Name")
private String Name;

@Column(name="Fname")
private String Fname;

@Column(name="Mobile")
private String Mobile;

@Column(name="deptID")
private int deptID;

@Column(name="slbID")
private int slbID;

@Column(name="grID")
private int grID;

@Column(name="birth_date")
private Date birthDate;


@Column(name="gender")
private String gender;

@Column(name="joining_date")
private Date joiningDate;


@Column(name="Address")
private String Address;


public Employees() {
	super();
	// TODO Auto-generated constructor stub
}


public Employees(int empID, String name, String fname, String mobile, int deptID, int slbID, int grID,
		Date birthDate, String gender, Date joiningDate, String address) {
	super();
	this.empID = empID;
	Name = name;
	Fname = fname;
	Mobile = mobile;
	this.deptID = deptID;
	this.slbID = slbID;
	this.grID = grID;
	this.birthDate = birthDate;
	this.gender = gender;
	this.joiningDate = joiningDate;
	Address = address;
}


public int getEmpID() {
	return empID;
}


public void setEmpID(int empID) {
	this.empID = empID;
}


public String getName() {
	return Name;
}


public void setName(String name) {
	Name = name;
}


public String getFname() {
	return Fname;
}


public void setFname(String fname) {
	Fname = fname;
}


public String getMobile() {
	return Mobile;
}


public void setMobile(String mobile) {
	Mobile = mobile;
}


public int getDeptID() {
	return deptID;
}


public void setDeptID(int deptID) {
	this.deptID = deptID;
}


public int getSlbID() {
	return slbID;
}


public void setSlbID(int slbID) {
	this.slbID = slbID;
}


public int getGrID() {
	return grID;
}


public void setGrID(int grID) {
	this.grID = grID;
}


public Date getBirthDate() {
	return birthDate;
}


public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
}


public String getGender() {
	return gender;
}


public void setGender(String gender) {
	this.gender = gender;
}


public Date getJoiningDate() {
	return joiningDate;
}


public void setJoiningDate(Date joiningDate) {
	this.joiningDate = joiningDate;
}


public String getAddress() {
	return Address;
}


public void setAddress(String address) {
	Address = address;
}


@Override
public String toString() {
	return "Employees [empID=" + empID + ", Name=" + Name + ", Fname=" + Fname + ", Mobile=" + Mobile + ", deptID="
			+ deptID + ", slbID=" + slbID + ", grID=" + grID + ", birthDate=" + birthDate + ", gender=" + gender
			+ ", joiningDate=" + joiningDate + ", Address=" + Address + "]";
}

}
