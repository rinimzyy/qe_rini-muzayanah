Feature: Network
  As a user
  I want to connect to other people
  So that i can see their activity

  Scenario: As user i have be able to connect to other people
    Given I am on the network page
    When I click follow button on people account
    And My request is accepted
    Then I can see their activity