Feature:

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login Button
    Then User should login successfully

  Scenario Outline:  Select AcademicPeriod
    And Click on the element in LeftNav
      | EntaranceExam |
      | ExamSetup     |
      | ExamButton    |
    And Click on the element in Dialog
      | Addbutton |
    And User sending the keys in Dialog
      | NameInput | <name> |
    And Click on the element in Dialog
      | AcademicPeriod   |
      | academicPeriod1  |
      | GradeLevel       |
      | GradeLevelSelect |
    And Click on the element in Dialog
      | SaveBuTTon |
    And Click on the element in LeftNav
      | EntaranceExam |
      | ExamSetup     |
      | ExamButton    |
    And Click on the element in Dialog
      | searchAcademicPeriod |
      | academicPeriod1      |
    And User delete the element from Dialog
      | <name> |

    Examples:
      | name      |
      | kekler123 |
      | kekler124 |
      | kekler125 |
      | kekler126 |
      | kekler127 |