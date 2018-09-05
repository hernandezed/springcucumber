package com.example.cucumber.democucumber.controller;

import com.example.cucumber.democucumber.domain.Employee;
import com.example.cucumber.democucumber.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("")
    public List<Employee> employees() {
        return employeeService.findAll();
    }

}
