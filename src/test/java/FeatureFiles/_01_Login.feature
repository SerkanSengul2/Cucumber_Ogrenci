Feature:Login Functionality

  @SmokeTest @Regression
  Scenario: Login With Valid Username And Password

    Given Navigate to Campus
    When  Enter username and password and click Login Button
    Then User should login successfully


