Feature: Choose Product
  As a user
  I want to choose a product
  So that i can make transactions

  Scenario: As user i have be able to choose product
    Given I am on the product page example pulsa
    When I enter my number
    And Product list is displayed
    Then I click the product i want
    And Redirected to the payment page