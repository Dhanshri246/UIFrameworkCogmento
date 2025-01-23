Feature: Test Cogmento URL

  Scenario: Test login functionality
    Given user is on login page
    When user enter "prafulp1010@gmail.com" and "Pr@ful0812"
    Then user click on login button

  Scenario: Test Home Page functinality
    When user check logo status
    Then user click on contact link
