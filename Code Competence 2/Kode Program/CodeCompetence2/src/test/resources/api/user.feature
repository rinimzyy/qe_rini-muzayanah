Feature: User

  Scenario: USER - GET detail data user
    Given I GET API user endpoints
    When I GET HTTP request user data
    And I receive valid data for detail user
    Then I receive valid user HTTP response code 200

  Scenario: USER - GET a single user with invalid endpoints
    Given I GET API single user with invalid endpoints
    When I GET HTTP request single user with invalid endpoints
    And I receive invalid data for single user
    Then I receive invalid GET single user response code 404

  Scenario: USER - GET ALL detail data user
    Given I GET API all user endpoints
    When I GET HTTP request all user data
    Then I receive valid get all user HTTP response code 200

  Scenario: USER - GET ALL detail data user with invalid url
    Given I GET Wrong API all user url endpoints
    When I GET HTTP url request all user data
    Then I receive valid get all user HTTP response code 404

  Scenario: USER - GET limit result with valid param
    Given I GET user limit result
    When I GET HTTP request with valid param
    And I receive limit result with request param
    Then I receive valid GET limit result response code 200

  Scenario: USER - GET limit result with invalid param
    Given I GET user limit result invalid param
    When I GET HTTP request with invalid param
    And I receive limit result with invalid request param
    Then I receive invalid GET limit result response code 404

  Scenario: USER - GET result user in descending sort
    Given I GET API user endpoint
    When I GET HTTP request user with decending sort
    Then I receive valid get descending user HTTP response code 200

  Scenario: USER - GET result user in descending sort
    Given I GET wrong API user endpoint
    When I GET wrong HTTP request user with decending sort
    Then I receive invalid get descending user HTTP response code 404

  Scenario: USER - USER POST new product with valid data
    Given I access POST API user endpoints
    When I POST HTTP request with a valid data
    And I receive valid data for new user
    Then I receive an valid POST response code 200

  Scenario: USER - USER POST new product with invalid data
    Given I POST the API user endpoints invalid
    When I POST HTTP request with an invalid data
    And I failed to receive data
    Then I receive invalid POST response code 400

  Scenario: USER - USER PUT existing user
    Given I PUT API user endpoints
    When I PUT an HTTP request
    And I receive valid data for updated user
    Then I receive valid PUT response code 200

  Scenario: USER - PUT existing user with invalid endpoints
    Given I PUT API user with invalid endpoints
    When I PUT an HTTP request with invalid endpoints
    And I receive invalid data for updated user
    Then I receive invalid PUT response code 404

  Scenario: USER - DELETE existing user with valid id
    Given I DELETE API user endpoints
    When I DELETE user HTTP request with valid id
    And I receive valid DELETE user response code 200

  Scenario: USER - DELETE existing user with invalid id
    Given I DELETE API user with invalid id endpoints
    When I DELETE user HTTP request with invalid id
    And I receive invalid DELETE user response code 404