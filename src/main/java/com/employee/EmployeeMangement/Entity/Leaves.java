package com.employee.EmployeeMangement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="leaves")
public class Leaves {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="levID")
private int levID;

@Column(name="lev_Typ")
private String levTyp;

@Column(name="status")
private String status;

@Column(name="lev_Num")
private int levNum;

@Column(name="lev_Amt")
private int levAmt;

public Leaves(int levID, String levTyp, String status, int levNum, int levAmt) {
	super();
	this.levID = levID;
	this.levTyp = levTyp;
	this.status = status;
	this.levNum = levNum;
	this.levAmt = levAmt;
}

public Leaves() {
	super();
}

public int getLevID() {
	return levID;
}

public void setLevID(int levID) {
	this.levID = levID;
}

public String getLevTyp() {
	return levTyp;
}

public void setLevTyp(String levTyp) {
	this.levTyp = levTyp;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public int getLevNum() {
	return levNum;
}

public void setLevNum(int levNum) {
	this.levNum = levNum;
}

public int getLevAmt() {
	return levAmt;
}

public void setLevAmt(int levAmt) {
	this.levAmt = levAmt;
}

@Override
public String toString() {
	return "Leaves [levID=" + levID + ", levTyp=" + levTyp + ", status=" + status + ", levNum=" + levNum + ", levAmt="
			+ levAmt + "]";
}




}
