Feature: Test Cogmento URL

  Scenario: Test login functionality
    Given user is on login page
    When user enter "prafulp1010@gmail.com" and "Pr@ful0812"
    Then user click on login button

  Scenario: validate home page logo
    Given user is on home page
