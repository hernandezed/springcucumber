package com.example.cucumber.democucumber.repository;

import com.example.cucumber.democucumber.domain.Employee;

import java.util.List;

public interface EmployeeRepository {

    Employee save(Employee employee);

    List<Employee> findAll();
}
