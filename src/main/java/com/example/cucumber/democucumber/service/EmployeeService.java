package com.example.cucumber.democucumber.service;

import com.example.cucumber.democucumber.domain.Employee;

import java.util.List;


public interface EmployeeService {

    Employee save(Employee employee);

    List<Employee> findAll();
}
