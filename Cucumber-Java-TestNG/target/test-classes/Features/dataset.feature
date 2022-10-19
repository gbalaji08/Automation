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
@RegressionTest
Feature: Reset functionality of login page
  
  Scenario Outline: Verification of reset button with numbers of credential
    Given Open chrome and launch the application
    When Enter the username <username> and password <password>
    Then Reset credential

    Examples: 
      |username      |password     |
      |User1         |pass1        |
      |User2         |pass2        |
      |User3         |pass3        |