package com.example.cucumber.democucumber.steps;

import com.example.cucumber.democucumber.DemoCucumberApplication;
import com.example.cucumber.democucumber.domain.Employee;
import com.example.cucumber.democucumber.service.EmployeeService;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javafx.application.Application;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = DemoCucumberApplication.class, loader = SpringBootContextLoader.class)
@Ignore
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GetAllEmployees {

    @Autowired
    private EmployeeService employeeService;

    @Value("${local.server.port}")
    int port;

    private List<Employee> employees;

    @Given("^the following employees in the system$")
    public void the_following_employees_in_the_system(DataTable dt) throws Throwable {
        dt.asList(Employee.class).forEach(e -> employeeService.save(e));
    }

    @When("^find all employess$")
    public void find_all_employess() throws Throwable {
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpEntity<?> entity = new HttpEntity<>(httpHeaders);
        employees = new RestTemplateBuilder().build().exchange("http://localhost:" + port + "/employees", HttpMethod.GET, entity, new ParameterizedTypeReference<List<Employee>>() {
        }).getBody();
    }

    @Then("^return list with (\\d+) employees$")
    public void return_list_with_employees(int size) throws Throwable {
        assertThat(employees).hasSize(size);
    }

}
