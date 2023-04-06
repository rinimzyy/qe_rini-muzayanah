@productPayment
Feature: product payment
  As a user
  I want to pay my transaction
  So that I can get the product

  @PaymentB
  Scenario: As user i have be able to do a payment
    Given I already choose a product
    When I enter invalid email
    Then I click the pay method
    And I click the pay button
    And A warning appears that user must enter a valid email
@PaymentA
  Scenario: As user i have be able to do a payment
    Given I already choose product
    When I enter my email
    Then I click pay method
    And I click pay button

