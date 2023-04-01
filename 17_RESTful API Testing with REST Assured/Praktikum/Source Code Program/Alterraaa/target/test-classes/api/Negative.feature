Feature: User
  As an admin
  I want to see user data using ID
  So that I can see detail user

  Scenario: GET ALL - As admin I have be able to get all user
    Given I set wrong GET endpoints url
    When I send wrong get HTTP request url
    Then I receive invalid HTTP status code 404

  Scenario: GET - As admin I have be able to get user data by ID
    Given I set wrong GET endpoints
    When I send wrong GET HTTP request
    Then I receive invalid HTTP response code 404

  Scenario: POST - As admin I have be able to add new data
    Given I set wrong POST endpoints
    When I send wrong POST HTTP request
    Then I receive invalid POST HTTP response code 500

  Scenario: PUT - As admin I have be able to add new data
    Given I set wrong PUT endpoints
    When I send wrong PUT HTTP request
    Then I receive invalid PUT HTTP response code 500

  Scenario: DELETE - As admin I have be able to add new data
    Given I set wrong DELETE endpoints
    When I send wrong DELETE HTTP request
    Then I receive invalid DELETE HTTP response code 404