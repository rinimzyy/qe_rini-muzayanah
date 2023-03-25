Feature: Post
  As a user
  I want to post about my activity
  So that my network can see my activity

  Scenario: As user i have be able to post my activity
    Given I am on the post tab
    When I write something about my activity
    And I click post button
    Then My network can see my activity