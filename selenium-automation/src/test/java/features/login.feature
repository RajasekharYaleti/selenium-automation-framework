Feature: Login functionality

 Feature: Login functionality

  Scenario: Valid login
    Given user is on login page
    When user enters valid Clinic Id , username and password
    And clicks on login button
    Then user should be redirected to the Test Orders and  Results Page
