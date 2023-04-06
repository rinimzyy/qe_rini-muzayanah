@product
Feature: choose product
  As a user
  I want to see my home page
  So that I can choose a product

  Scenario: As user i have be able to choose product
    Given I already on homepage
    When I click Pulsa button
    And I enter my valid phone number
    Then I can choose a product
    And I redirected to payment method

  Scenario: As user i have be able to success login
    Given I already on web homepage
    When I click the Pulsa button
    And I enter 14 digit phone number
    Then A warning appears that the telephone number exceeds the maximum limit

