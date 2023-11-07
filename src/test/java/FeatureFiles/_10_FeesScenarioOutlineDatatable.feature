#Senaryo:
#  Daha önceki Fee Functionality Senaryosunu
#  name, code, intCode ve priority için 5 farklı kombinasyon için çalıştırınız.

Feature: Fees multiple values functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login Button
    Then User should login successfully

  Scenario Outline: Fee Functionality
    And Click on the element in LeftNav
      | Setup      |
      | Parameters |
      | Fees       |

    And Click on the element in Dialog
      | Addbutton |

    And User sending the keys in Dialog
      | NameInput       | <name>     |
      | CodeInput       | <code>     |
      | IntegrationCode | <intCode>  |
      | PriorityCode    | <priority> |

    And Click on the element in Dialog
      | ToggleBar  |
      | SaveButton |

    Then Success message should be displayed

    And User delete the element from Dialog
      | <name> |

    Then Success message should be displayed

    Examples:
      | name   | code  | intCode  | priority |
      | kekwe1 | 98712 | PayPal   | 5874     |
      | kekwe2 | 9873  | Cash     | 5875     |
      | kekwe3 | 9874  | Cheque   | 5876     |
      | kekwe4 | 9875  | ApplaPay | 5877     |
      | kekwe5 | 9876  | Crypto   | 5878     |