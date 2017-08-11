Feature: newAccount

  Scenario: create new account for customer
    Given user is logged in
    When customer will enter details
    Then account created for customer
