#Author: Gayathiridevi
#Keywords Summary :
@tag
Feature: TD Home Search functionality

  Scenario: Checking search functionality in TD Home
    Given User is on Home Page
    Then User enters text in Search box
    And User closes the adchoices 
    And User clicks on search button
    And User waits for some time
    Then User closes the browser
