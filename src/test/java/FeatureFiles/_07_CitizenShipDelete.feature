Feature: DeleteCitizenShip

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
    And Delete Citizenship name as "<name>"
    Then i able to see delete mesaage
    Examples:
      | name         | shortname |
      | etetetetet12 | ser3      |
      | etetetetet13 | ser4      |
      | etetetetet14 | ser5      |
      | etetetetet15 | ser6      |
      | etetetetet16 | ser7      |


