Feature: Integration

  Scenario: WB026 - User register, login, logout
    Given User on register page
    When User success register
    And User success login
    And User success logout
    Then Integration testing success

  Scenario: WB027 - User register, login, see detail product, assign rating
    Given User on register pages
    When User success to register
    And User success to login
    And User success see detail product
    And User success assign rating
    Then Integration test success

  Scenario: WB028 - User register, login, add to cart, order, view transaction history
    Given User on the register pages
    When User success register to web
    And User success login to web
    And User success add product to cart
    And User success order
    Then Web integration test success

  Scenario: WB029 - User register, login, select categories, clear categories
    Given User on the register web pages
    When User success register to web page
    And User success login to web page
    And User success select categories
    And User success clear categories
    Then Web integration success

  Scenario: WB030 - User register, login, see detail product, assign rating, logout
    Given User in register pages
    When User successfully register
    And User successfully to login
    And User successfully see detail product
    And User successfully assign rating
    And User logout
    Then Integration test successfully

  Scenario: WB031 - User register, login, add to cart, order, view transaction history, logout
    Given User in the register pages
    When User successfully register to web
    And User successfully login to web
    And User successfully add product to cart
    And User successfully order
    And User Log Out
    Then Web integration test successfully success
