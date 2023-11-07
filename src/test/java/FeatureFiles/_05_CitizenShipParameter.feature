Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login Button
    Then User should login successfully
    And Navigate to Citizenship

  Scenario: Create a Citizenship
    When Create a Citizenship name as "Serkancık" short name as "serkan80"
    Then Success message should be displayed

    When Create a Citizenship name as "Serkancık" short name as "serkan80"
    Then Already exist message should be displayed