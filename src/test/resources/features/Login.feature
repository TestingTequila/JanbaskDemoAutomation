Feature: Login Page Scenarios

  Scenario: Valid email & Password
    And Click on My Account icon
    When Click on login Link
    And Enter correct email
    And Enter correct password
    When Click on Login button
    Then Validate Login Status

