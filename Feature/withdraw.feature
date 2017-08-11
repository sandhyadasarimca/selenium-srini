Feature: withdraw

  Scenario: customer can withdraw need amount from account how much they had
    Given user is logged in
    When customer enters account no and withdraw the amount
    Then account debited by amount
