Feature: Login page

  Scenario: UI validation
    Given User on the login page
    Then Username field should present
    And Username placeholder should be "Username"
    And Username field should be writable
    And Password field should present
    And Password field placeholder should be "Password"
    And Password field should be writable
    And Login button should present