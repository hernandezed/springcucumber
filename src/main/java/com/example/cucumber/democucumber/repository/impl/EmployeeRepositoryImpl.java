package com.example.cucumber.democucumber.repository.impl;


import com.example.cucumber.democucumber.repository.EmployeeRepository;
import com.example.cucumber.democucumber.domain.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    List<Employee> employees;

    public EmployeeRepositoryImpl() {
        this.employees = new ArrayList<>();
    }

    @Override
    public Employee save(Employee employee) {
        employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> findAll() {
        return employees;
    }
}
