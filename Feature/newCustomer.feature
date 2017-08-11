Feature: newCustomer

  Scenario: create new customer with valid user credentials
    Given user is logged in
    When enter new customer details
    Then new customer created
