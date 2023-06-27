#Author: Gayathiridevi
#Keywords Summary :
@tag
Feature: TD Home Search functionality

  Background: 
    Given User is on Home Page

  @smoketag
  Scenario: Checking search functionality in TD Home
    When User enters text in Search box
    Then User closes the adchoices
    And User clicks on search button
    And User waits for some time
    Then User closes the browser

  @regressiontag @smoketag
  Scenario Outline: Checking search functionality with data
    When User enters the text <SearchText> in Search
    Then User closes the adchoices
    And User clicks on search button
    And User waits for some time
    Then User closes the browser

    Examples: 
      | SearchText                                    |
      | How do I cancel my TD Insurance policy        |
      | What are my payment options with TD Insurance |
