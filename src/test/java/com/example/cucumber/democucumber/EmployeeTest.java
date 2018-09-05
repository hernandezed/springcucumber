package com.example.cucumber.democucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/feature"}, glue = {"com.example.cucumber.democucumber.steps"})
public class EmployeeTest {
}
