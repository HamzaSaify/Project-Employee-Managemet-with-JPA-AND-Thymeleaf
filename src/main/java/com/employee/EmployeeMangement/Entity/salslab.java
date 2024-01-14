package com.employee.EmployeeMangement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="salslab")
public class salslab {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="slbID")
private int slbID;

@Column(name="HRA")
private int HRA;

@Column(name="DA")
private int DA;

@Column(name="TA")
private int TA;

@Column(name="PF")
private int PF;

public salslab() {
	super();
	// TODO Auto-generated constructor stub
}

public salslab(int slbID, int hRA, int dA, int tA, int pF) {
	super();
	this.slbID = slbID;
	HRA = hRA;
	DA = dA;
	TA = tA;
	PF = pF;
}


public int getSlbID() {
	return slbID;
}

public void setSlbID(int slbID) {
	this.slbID = slbID;
}

public int getHRA() {
	return HRA;
}

public void setHRA(int hRA) {
	HRA = hRA;
}

public int getDA() {
	return DA;
}

public void setDA(int dA) {
	DA = dA;
}

public int getTA() {
	return TA;
}

public void setTA(int tA) {
	TA = tA;
}

public int getPF() {
	return PF;
}

public void setPF(int pF) {
	PF = pF;
}

@Override
public String toString() {
	return "salslab [slbID=" + slbID + ", HRA=" + HRA + ", DA=" + DA + ", TA=" + TA + ", PF=" + PF + "]";
}






}
