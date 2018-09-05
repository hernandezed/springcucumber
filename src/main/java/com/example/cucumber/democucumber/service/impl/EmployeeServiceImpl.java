package com.example.cucumber.democucumber.service.impl;

import com.example.cucumber.democucumber.domain.Employee;
import com.example.cucumber.democucumber.repository.EmployeeRepository;
import com.example.cucumber.democucumber.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
