@sprint2 @common
Feature: As a tester I open facebook application to
    enter my valid user name and password and I  click login button 
    so that i can be logged in with my credential

  Scenario: Login test with user input
    Given user open "Edge" and "https://www.facebook.com/"
    When user enter username "Sumon"
    And user enter password "jjjjk"
    And user click on login button
    Then user logged in facebook

  Scenario: Login test with user input
    Given user open "Chrome" and "https://www.facebook.com/"
    When user enter username "Kalam"
    And user enter password "jjjjk"
    And user click on login button
    Then user logged in facebook

  Scenario: Login test with user input
    Given user open "Firefox" and "https://www.facebook.com/"
    When user enter username "Tamjid"
    And user enter password "jjjjk"
    And user click on login button
    Then user logged in facebook
