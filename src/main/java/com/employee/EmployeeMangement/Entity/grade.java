package com.employee.EmployeeMangement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="grade")
public class grade {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="grID")
private int grID;

@Column(name="grade")
private String grade;

@Column(name="base_Sal")
private int baseSal;

public grade() {
	super();
	
	// TODO Auto-generated constructor stub
}

public grade(int grID, String grade, int baseSal) {
	super();
	this.grID = grID;
	this.grade = grade;
	this.baseSal = baseSal;
}

public int getGrID() {
	return grID;
}

public void setGrID(int grID) {
	this.grID = grID;
}

public String getGrade() {
	return grade;
}

public void setGrade(String grade) {
	this.grade = grade;
}

public int getBaseSal() {
	return baseSal;
}

public void setBaseSal(int baseSal) {
	this.baseSal = baseSal;
}

@Override
public String toString() {
	return "grade [grID=" + grID + ", grade=" + grade + ", baseSal=" + baseSal + "]";
}


}
