Feature: editAccount

  Scenario: change account from savings to current
    Given user is logged in
    When customer enters account no
    Then changes added to account
