Feature: Country Functionality

  @SmokeTest @Regression
  Scenario: Create a Country
    Given Navigate to Campus
    When  Enter username and password and click Login Button
    Then  User should login successfully
    And Navigate to Country
    When Create a Country
    Then Success message should be displayed
