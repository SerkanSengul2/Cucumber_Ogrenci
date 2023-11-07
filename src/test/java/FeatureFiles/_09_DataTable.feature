Feature:

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login Button
    Then User should login successfully

  Scenario:
    And Click on the element in LeftNav
      | Setup      |
      | Parameters |
      | Countries  |
    And Click on the element in Dialog
      | Addbutton |
    And User sending the keys in Dialog
      | NameInput | teeter12 |
      | CodeInput | tete3    |
    And Click on the element in Dialog
      | SaveButton |
    Then Success message should be displayed

    And User delete the element from Dialog
      | teeter12 |

  Scenario:  Create Nationality
    And Click on the element in LeftNav
      | Setup       |
      | Parameters  |
      | Citizenship |

    And Click on the element in Dialog
      | Addbutton |

    And User sending the keys in Dialog
      | NameInput | ekekekw |

    And Click on the element in Dialog
      | SaveButton |

    Then Success message should be displayed

    And User delete the element from Dialog
      | ekekekw |

    Then Success message should be displayed

  Scenario: Fee Functionality
    And Click on the element in LeftNav
      | Setup      |
      | Parameters |
      | Fees       |

    And Click on the element in Dialog
      | Addbutton |

    And User sending the keys in Dialog
      | NameInput       | kekwf1ee221 |
      | CodeInput       | i32         |
      | IntegrationCode | 131         |
      | PriorityCode    | 2453        |

    And Click on the element in Dialog
      | ToggleBar  |
      | SaveButton |

    Then Success message should be displayed

    And User delete the element from Dialog
      | kekwf1ee221 |

    Then Success message should be displayed
