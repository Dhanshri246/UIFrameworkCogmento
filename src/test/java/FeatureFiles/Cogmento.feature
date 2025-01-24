Feature: Test Cogmento URL

  Scenario: Test login functionality
    Given user is on login page
    When user enter "prafulp1010@gmail.com" and "Pr@ful0812"
    Then user click on login button

  Scenario: Test Home Page functinality
    When user check logo status
    Then user click on contact link

  Scenario: Validate Contact Page Functionality
    When user click on create contact button
    And user enter first name and last name
    And user enter email and select status
    Then click on save button

  Scenario: Validate Deals Page fucntionality
    When user click on Deals link
    And user click on create deal link
    And user enter valid title
    Then user click on save button
