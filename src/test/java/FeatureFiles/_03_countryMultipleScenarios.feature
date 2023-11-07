Feature: Country Multi Scenario

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login Button
    Then User should login successfully
    And Navigate to Country
  @Regression
  Scenario: Create Country
    Given Navigate to Campus

    When Create a Country
    Then Success message should be displayed
  @Regression
  Scenario: Create Country 2
    When Create a Country name as "KeremLand" code as "Red65"
    Then Success message should be displayed
