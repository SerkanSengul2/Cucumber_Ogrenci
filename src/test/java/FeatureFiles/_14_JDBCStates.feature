Feature: Testing JDBC States

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login Button
    Then User should login successfully

  Scenario: States testing with JDBC
    And Click on the element in LeftNav
      | Setup      |
      | Parameters |
      | states     |
    Then Send The Query the Database "select name from states limit 10" and control match