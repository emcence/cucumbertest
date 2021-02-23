Feature: Buttons on Home page
  In order to test Home page
  As not registered user
  I want to be able to click on buttons on the page and see appropriate links


  Scenario: Open button Alla Utbildningar and verify respective link
    Given user is on Home page
    When user clicks on button Alla Utbildningar
    Then page Utbildningar is opened