Feature: Post
  As a user
  I want to logout from my account
  So that i can finish my exploration

  Scenario: As user i have be able to logout
    Given I already login to my account
    When I click signout button
    Then I can logout from my account