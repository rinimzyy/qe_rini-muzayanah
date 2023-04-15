Feature: Product

  Scenario: PRODUCT - GET detail data product
    Given I GET API products endpoints
    When I GET HTTP request
    And I receive valid data for detail product
    Then I receive valid HTTP response code 200

  Scenario: PRODUCT - GET a single product with invalid endpoint
    Given I GET API products with invalid endpoints
    When I GET HTTP request with invalid endpoint
    And I receive invalid data for detail product
    Then I receive invalid GET response code 404

  Scenario: PRODUCT - GET ALL detail data product
    Given I GET API all product endpoints
    When I GET HTTP request all product data
    Then I receive valid get all product HTTP response code 200

  Scenario: PRODUCT - GET ALL detail data product with invalid url
    Given I GET Wrong API all product url endpoints
    When I GET HTTP url request all product data
    Then I receive valid get all product HTTP response code 404

  Scenario: PRODUCT - GET limit result product with valid param
    Given I GET user limit result product with valid param
    When I GET HTTP request limit result product with valid param
    And I receive limit result product with request param
    Then I receive valid GET limit result product response code 200

  Scenario: PRODUCT - GET limit result product with invalid param
    Given I GET user limit result product with invalid param
    When I GET HTTP request limit result product with invalid param
    And I receive limit result product with invalid request param
    Then I receive invalid GET limit result product response code 404

  Scenario: PRODUCT - GET result in descending sort
    Given I GET API product endpoints
    When I GET HTTP request product with decending sort
    Then I receive valid get descending product HTTP response code 200

  Scenario: PRODUCT - GET result in descending sort (Baru ditambahin)
    Given I GET wrong API product endpoints
    When I GET wrong HTTP request product with decending sort
    Then I receive invalid get descending product HTTP response code 404

  Scenario: PRODUCT - GET ALL categories product
    Given I GET API all categories product endpoints
    When I GET HTTP request all categories product data
    Then I receive valid get all categories product HTTP response code 200

  Scenario: PRODUCT - GET ALL categories product
    Given I GET wrong API all categories product endpoints
    When I GET wrong HTTP request all categories product data
    Then I receive invalid get all categories product HTTP response code 404

  Scenario: PRODUCT - GET in categories product
    Given I GET API categories product endpoints
    When I GET HTTP request categories product data
    Then I receive valid get categories product HTTP response code 200

  Scenario: PRODUCT - GET in categories product
    Given I GET wrong API categories product endpoints
    When I GET wrong HTTP request categories product data
    Then I receive invalid get categories product HTTP response code 404

  Scenario: PRODUCT - POST new product with valid data
    Given I POST API product endpoints
    When I POST HTTP request with valid data
    And I receive valid data for new product
    Then I receive valid HTTP response 200

  Scenario: PRODUCT - POST new product with invalid data
    Given I POST the API product endpoints
    When I POST wrong HTTP request with valid data
    Then I receive invalid response code 404

  Scenario: PRODUCT - PUT existing product
    Given I PUT API endpoints
    When I PUT HTTP request
    And I receive valid data for updated product
    Then I receive valid PUT response 200

  Scenario: PRODUCT - PUT existing product with invalid endpoints
    Given I PUT API with invalid endpoints
    When I PUT HTTP request with invalid endpoints
    And I receive invalid data for updated product
    Then I receive invalid PUT response 404

  Scenario: PRODUCT - DELETE existing product with valid id
    Given I DELETE API endpoints
    When I DELETE HTTP request with valid id
    And I receive valid DELETE response code 200

  Scenario: PRODUCT - DELETE existing cart with invalid id
    Given I DELETE API product with invalid id endpoints
    When I DELETE product HTTP request with invalid id
    And I receive invalid DELETE product response code 404

