#  Excelden okuduğunuz Citizenship bilgilerini önce hepsini kaydedin
#  daha sonrada siliniz.

Feature: ApachePOI Citizen functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login Button
    Then User should login successfully
    And Navigate to Citizenship

  Scenario: Create and Delete CitizenShip from excel
    When User create citizenship with ApachePOI
    Then User delete citizenship with ApachePOI