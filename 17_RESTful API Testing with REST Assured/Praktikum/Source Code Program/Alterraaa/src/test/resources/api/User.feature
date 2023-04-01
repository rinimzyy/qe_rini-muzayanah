Feature: User
  As an admin
  I want to see user data using ID
  So that I can see detail user

  Scenario: GET ALL - As admin I have be able to get all user
    Given I set GET endpoints url
    When I send GET HTTP request url
    Then I receive valid HTTP status code 200

  Scenario: GET - As admin I have be able to get user data by ID
    Given I set GET endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data according the ID

  Scenario: POST - As admin I have to be able to add new data
    Given I set POST endpoints url
    When I send POST HTTP request url
    Then I receive valid HTTP response code 201
    And I receive valid response body

  Scenario: PUT - As admin I have to be able to update data
    Given I set PUT endpoints url
    When I send PUT HTTP request url
    Then I receive valid PUT HTTP response code 200
    And I receive valid updated response body

  Scenario: DELETE - As admin I have be able to delete user data
    Given I set DELETE endpoints
    When I send DELETE HTTP request
    Then I receive valid delete HTTP response code 200