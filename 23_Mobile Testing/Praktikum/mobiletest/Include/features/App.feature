#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: App

  @Login01
  Scenario Outline: User failed login because password is empty
     Given User open the aplicasition
     And User register to the application 
     When User successfully register
     And Press Back to Login
     And User set() in "<email>"
     And User click() login button
     Then User cannot logged in to the application because password is empty

  @Login02
  Scenario Outline: User successfully login
     Given User open app application
     And User register to the app 
     When User successfully register to app
     And Press Back
     And User set() in Email field "<email>"
     And User set() in Password field "<password>"
     And User click() the login button
     Then User success login
     
  @Register01
  Scenario Outline: User want to register to app without fill email
     Given User open the app
     When User redirect to the register page 
     And User set() Name "<name>"
     And User set() Password "<password>"
     And User set() Confirm Password "<confirm_password>"
     And User click() Register button 
     Then Warning to enter valid email displayed

	@Register02
	Scenario Outline: User want to register to app invalid register with missing password field 
     Given User open in the app
     When User redirect in the register page 
     And User set() the Name "<name>"
     And User set() the Email "<email>"
     And User set() the Password "<password>"
     And User set() confirmation password "<confirm_password>"
     And User click() the Register button
     Then User successfully login

  @Dashboard01
  Scenario Outline: User to access dasboard
     Given User open aplikasi the app
     When User redirect register page 
     And User set() Name in the app "<name>"
     And User set() Email in the app "<email>"
     And User set() Password in the app "<password>"
     And User set() Confirm Password in the app "<confirmPassword>"
     And User click() in the register button
     When Press back to login button 
     And User set() Email to app "<email>"
     And User set() Passowrd in the app "<password>"
     And User click() in the login button
     Then User can successfully go to dashboard   
   