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
Feature: As a user I wish to be able to search for cruises to the Bahamas
As a user I want to search cruises to The Bahamas with duration between six and nine days so that I will visualize all the options to choose one. Right now, I don’t care about departure port.
  		  

  @tag1
  Scenario Outline: As a user I wish to be able to search for cruises to the Bahamas
    Given I have entered the main page of carnival
    When you select the Plan option located in the main menu
    Then you should see at the top the query filter with the following fields: Sail To, Sail From, Dates, Duration

 