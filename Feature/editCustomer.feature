Feature: editCustomer

  Scenario: we can change details if we need
    Given user is logged in
    When we changed customer details
    Then changes added in customer account 
