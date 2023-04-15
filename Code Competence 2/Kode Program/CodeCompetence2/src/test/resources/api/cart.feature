Feature: Cart

  Scenario: CART - GET detail data cart
    Given I GET API cart endpoints
    When I GET HTTP request cart data
    And I receive valid data for detail cart
    Then I receive valid cart HTTP response code 200

  Scenario: CART - GET a single cart with invalid url
    Given I GET API single cart with invalid url
    When I GET HTTP request single cart data with invalid url
    And  I receive invalid data for single cart
    Then I receive invalid GET single cart response code 404

  Scenario: CART - GET result in descending sort
    Given I GET wrong API cart endpoint
    When I GET wrong HTTP request cart with decending sort
    Then I receive invalid get descending cart HTTP response code 404

  Scenario: CART - GET ALL detail data cart
    Given I GET API all cart endpoints
    When I GET HTTP request all cart data
    Then I receive valid get all cart HTTP response code 200

  Scenario: CART - GET limit result cart with valid param
    Given I GET user limit result cart with valid param
    When I GET HTTP request limit result cart with valid param
    And I receive limit result cart with request param
    Then I receive valid GET limit result cart response code 200

  Scenario: CART - GET limit result cart with invalid param
    Given I GET user limit result cart with invalid param
    When I GET HTTP request limit result cart with invalid param
    And I receive limit result cart with invalid request param
    Then I receive invalid GET limit result cart response code 404

  Scenario: CART - GET result cart in descending sort
    Given I GET API cart endpoint
    When I GET HTTP request cart with decending sort
    Then I receive valid get descending cart HTTP response code 200

  Scenario: CART - GET ALL detail data user cart with invalid url
    Given I GET Wrong API all cart url endpoints
    When I GET HTTP url request all cart data
    Then I receive valid get all cart HTTP response code 404

  Scenario: CART - GET detail data user cart with invalid url
    Given I GET API user cart url endpoints
    When I GET HTTP url request user cart data
    Then I receive valid get user cart HTTP response code 404

  Scenario: CART - GET in date range cart with valid data
    Given I GET API in date range cart param with valid data
    When I GET HTTP request data range cart param with valid data
    And I receive valid data with data range cart param
    Then I receive valid GET data range cart response code 200

  Scenario: CART - GET in date range cart with invalid data
    Given I GET API in date range cart param with invalid data
    When I GET HTTP request data range cart param with invalid data
    And I receive invalid data with data range cart param
    Then I receive invalid GET data range cart response code 404

  Scenario: CART - POST new cart with valid data
    Given I POST API cart endpoints
    When I POST HTTP request with valid data cart
    And I receive valid data for new cart
    Then I receive valid cart response 200

  Scenario: CART - POST new cart with invalid data
    Given I POST API new cart with invalid endpoints
    When I POST HTTP request with invalid data cart
    And I receive invalid data for new cart
    Then I receive invalid POST new cart response code 404

  Scenario: CART - PUT existing cart
    Given I PUT cart API endpoints
    When I PUT cart HTTP request
    And I receive valid data for updated cart
    Then I receive valid PUT cart response 200

  Scenario: CART - PUT existing cart with invalid data
    Given I PUT cart API with invalid endpoints
    When I PUT cart HTTP request with invalid data cart
    And I receive invalid data for updated cart
    Then I receive invalid PUT cart response code 404

  Scenario: CART - DELETE existing cart with valid id
    Given I DELETE API cart endpoints
    When I DELETE cart HTTP request with valid id
    And I receive valid DELETE cart response code 200

  Scenario: CART - DELETE existing cart with invalid id
    Given I DELETE API cart with invalid id endpoints
    When I DELETE cart HTTP request with invalid id
    And I receive invalid DELETE cart response code 404
