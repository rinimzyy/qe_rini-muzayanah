Feature: Login
  As a user
  I want to login to sepulsa
  So that i can go to my homepage

  Scenario: As user i have be able to success login
    Given I am on the login page
    When I enter my username and password
    And I click login button
    Then I am on the home page