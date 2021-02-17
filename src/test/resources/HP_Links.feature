Feature: Links on Home page
  In order to test Home page
  As not registered user
  I want to be able to move throw the links on the page


  Scenario: Open link Utbildningar
    Given user is on Home page
    When user clicks on link Utbildningar
    Then page Utbildningar is opened

  Scenario: Open link Om Oss
    Given user is on Home page
    When user clicks on link OmOss
    Then page OmOss is opened

  Scenario: Open link Nyheter
    Given user is on Home page
    When user clicks on link Nyheter
    Then page Nyheter is opened