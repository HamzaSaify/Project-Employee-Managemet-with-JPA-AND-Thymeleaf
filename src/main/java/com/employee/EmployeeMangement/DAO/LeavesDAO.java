package com.employee.EmployeeMangement.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.EmployeeMangement.Entity.Leaves;

public interface LeavesDAO extends JpaRepository<Leaves, String>{

}
