package com.employee.EmployeeMangement.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.EmployeeMangement.Entity.grade;

public interface GradeDAO extends JpaRepository<grade, String> {

}
