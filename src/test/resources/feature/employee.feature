Feature: Employees

  Scenario: Get all employees
    Given the following employees in the system
      | docket | name        |surname | salary  |
      | 111111 | Jorge       | Gomez  | 18000   |
      | 222222 | Jose        | Perez  | 20000   |
      | 333333 | Laura       | Medina | 40000   |
    When find all employess
    Then return list with 3 employees