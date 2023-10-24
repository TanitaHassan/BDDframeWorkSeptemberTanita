@scenarioOutline @common
Feature: login feature with out line

  Scenario Outline: As a user open facebook application to
    enter valid user name and password and click login button for multple users 
    so that user can be logged in with credential

    Given user enter <browser>  and <Url> to open application
    When user enter <userName> and <password> on the input field
    And user click on loginButton
    Then user close the application

    Examples: 
      | browser  | Url                         | userName | password |
      | "Chrome" | "https://www.facebook.com/" | "Tanita1" | "kkk"    |
      | "Edge" | "https://www.facebook.com/" | "Tanita2" | "kkk"    |
      | "Firefox" | "https://www.facebook.com/" | "Tanita3" | "kkk"    |
      