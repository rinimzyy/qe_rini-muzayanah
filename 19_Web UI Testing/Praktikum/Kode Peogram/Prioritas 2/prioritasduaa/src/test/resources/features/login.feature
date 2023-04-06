@login
Feature: login
  As a user
  I want to see my home page
  So that I can update my profile

  Scenario: As user i have be able to success login
    Given I am on the login page
    When I enter valid username
    And I enter valid password
    And I click login button
    Then I am on the home page

  Scenario: As user i have be able to success login
    Given I am on the web login page
    When I enter invalid username
    And I enter valid user password
    And I click the login button
    Then I am have error message