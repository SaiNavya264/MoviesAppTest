Feature: Test Login Page
  Scenario: Testing Login form
    Given Navigate to Login Page
    When user enters username
    When user enters password
    When user clicks login button
    When user clicks Account page
    Then  user clicks logout