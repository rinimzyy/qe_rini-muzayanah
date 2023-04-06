@about
Feature: about
  As a user
  I want to see about menu
  So that I can see web details

  @userA
  Scenario: As user i have be able to see web details
    Given I successfully login
    When I am on the web home page
    And I click list menu button
    And I click About button
    Then I can see web details