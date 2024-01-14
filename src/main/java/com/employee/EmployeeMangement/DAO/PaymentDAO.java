package com.employee.EmployeeMangement.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.EmployeeMangement.Entity.Payment;

public interface PaymentDAO extends JpaRepository<Payment, String>{

} 
