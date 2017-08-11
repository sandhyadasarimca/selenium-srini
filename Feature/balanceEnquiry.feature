Feature: balanceEnquiry

  Scenario: we want to check bal in account
    Given user is logged in
    When customer enters account no
    Then customer check balance
