Feature:

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login Button
    Then User should login successfully

  Scenario: Select AcademicPeriod
    And Click on the element in LeftNav
      | EntaranceExam |
      | ExamSetup     |
      | ExamButton    |
    And Click on the element in Dialog
      | Addbutton |
    And User sending the keys in Dialog
      | NameInput | eturuktk12 |
    And Click on the element in Dialog
      | AcademicPeriod   |
      | Test2024         |
      | GradeLevel       |
      | GradeLevelSelect |
    And Click on the element in Dialog
      | SaveBuTTon |
    And Click on the element in LeftNav
      | EntaranceExam |
      | ExamSetup     |
      | ExamButton    |
    And User delete the element from Dialog
      | eturuktk12 |
    And Click on the element in Dialog
      | searchAcademicPeriod |
      | academicPeriod1      |
