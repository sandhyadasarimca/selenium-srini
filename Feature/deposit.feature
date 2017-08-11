Feature: deposit

  Scenario: we will deposit amount in account
    Given user is logged in
    When customer enters account no and deposit amount
    Then account creadited by amount
