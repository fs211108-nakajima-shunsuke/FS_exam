package com.freestyle.exam.estimates.repository;

import com.freestyle.exam.estimates.entity.Employees;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer>{
    
}
