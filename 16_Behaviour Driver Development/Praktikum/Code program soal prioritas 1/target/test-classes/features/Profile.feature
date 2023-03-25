Feature: Profile
  As a user
  I want to login to Linkdin
  So that i can see my profile

  Scenario: As user i have be able to see my profile
    Given I am on the Linkdin Dashboard
    When I click my profile
    Then I can see my profile