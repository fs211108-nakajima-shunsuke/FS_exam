package com.freestyle.exam.estimates.controller;

import java.util.List;

import com.freestyle.exam.estimates.entity.Employees;
import com.freestyle.exam.estimates.repository.EmployeesRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class EmployeesController {
    private final EmployeesRepository employeesRepository;
    
    public EmployeesController(EmployeesRepository employeesRepository){
        this.employeesRepository = employeesRepository;
    }

    @GetMapping("/api/v1/employees")
    public String showEmployees(){
        List<Employees> employeeList = employeesRepository.findAll();

        String hoge = employeeList.get(1).getName();
        System.out.println(hoge);
        return hoge;
    }
}
