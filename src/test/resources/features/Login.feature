@common
Feature: Valid Login test

  @sprint1 @smoke @regression
  Scenario: As a tester I open facebook application to
    enter my valid user name and password and I  click login button 
    so that i can be logged in

    Given I open facebook application
    When enter my valid user name
    And enter my valid password
    And I click login button
    Then i can be logged in
