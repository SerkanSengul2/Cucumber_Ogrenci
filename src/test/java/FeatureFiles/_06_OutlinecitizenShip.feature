Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login Button
    Then User should login successfully
    And Navigate to Citizenship

  Scenario Outline: Create a Citizenship
    When Create a Citizenship name as "<name>" short name as "<shortname>"
    Then Success message should be displayed

    When Create a Citizenship name as "<name>" short name as "<shortname>"
    Then Already exist message should be displayed

    Examples:
      | name       | shortname |
      | serkanci23 | ser3      |
      | serkanci24 | ser4      |
      | serkanci25 | ser5      |
      | serkanci26 | ser6      |
      | serkanci27 | ser7      |


