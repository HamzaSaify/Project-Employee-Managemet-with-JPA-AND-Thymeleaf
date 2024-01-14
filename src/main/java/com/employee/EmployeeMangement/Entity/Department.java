package com.employee.EmployeeMangement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="department")
public class Department {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="deptID")
private int deptId;


@Column(name="department")
private String department;

public Department() {
	
}
public Department(int deptId,String department) {
	this.deptId=deptId;
	this.department=department;
}
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}

@Override
public String toString() {
	return "Department [deptId=" + deptId + ", department=" + department + "]";
}


}
