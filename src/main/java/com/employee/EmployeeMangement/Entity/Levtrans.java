package com.employee.EmployeeMangement.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="levtrans")
public class Levtrans {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="ltID")
private int ltID;


@Column(name="empID")
private String empID;


@Column(name="no_Leave")
private int NoLeave;

@Column(name="from_Date")
private Date fromDate;

@Column(name="to_Date")
private Date toDate;

public Levtrans() {
	super();
	
}

public Levtrans(int ltID, String empID, int noLeave, Date fromDate, Date toDate) {
	super();
	this.ltID = ltID;
	this.empID = empID;
	NoLeave = noLeave;
	this.fromDate = fromDate;
	this.toDate = toDate;
}

public int getLtID() {
	return ltID;
}

public void setLtID(int ltID) {
	this.ltID = ltID;
}

public String getEmpID() {
	return empID;
}

public void setEmpID(String empID) {
	this.empID = empID;
}

public int getNoLeave() {
	return NoLeave;
}

public void setNoLeave(int noLeave) {
	NoLeave = noLeave;
}

public Date getFromDate() {
	return fromDate;
}

public void setFromDate(Date fromDate) {
	this.fromDate = fromDate;
}

public Date getToDate() {
	return toDate;
}

public void setToDate(Date toDate) {
	this.toDate = toDate;
}

@Override
public String toString() {
	return "Levtrans [ltID=" + ltID + ", empID=" + empID + ", NoLeave=" + NoLeave + ", fromDate=" + fromDate
			+ ", toDate=" + toDate + "]";
}

}
