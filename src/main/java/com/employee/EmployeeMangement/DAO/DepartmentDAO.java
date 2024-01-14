package com.employee.EmployeeMangement.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.EmployeeMangement.Entity.Department;

public interface DepartmentDAO extends JpaRepository<Department, String>{

}
