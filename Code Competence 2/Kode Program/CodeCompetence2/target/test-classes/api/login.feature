Feature: User
  As an admin
  I want to see user data using ID
  So that I can see detail user

  Scenario: LOGIN - As admin I have be able to login
    Given I set POST endpoints url
    When I send POST HTTP request url
    And I received status code 201 and token

  Scenario: LOGIN - As admin I have be able to login
    Given I set wrong POST endpoints
    When Username and password is empty
    Then I receive invalid HTTP response code 400
