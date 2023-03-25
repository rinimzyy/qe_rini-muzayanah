Feature: Payment
  As a user
  I want to do a payment
  So that My transaction can be successful

  Scenario: As user i have be success on my transaction
    Given I am on the payment page
    When I choose payment method example Dana
    And I click pay button
    Then Redirected to Dana application