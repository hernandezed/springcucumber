package com.example.cucumber.democucumber.domain;

import java.math.BigDecimal;

public class Employee {

    private String name;
    private String surname;
    private String docket;
    private BigDecimal salary;

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Employee setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getDocket() {
        return docket;
    }

    public Employee setDocket(String docket) {
        this.docket = docket;
        return this;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Employee setSalary(BigDecimal salary) {
        this.salary = salary;
        return this;
    }
}
