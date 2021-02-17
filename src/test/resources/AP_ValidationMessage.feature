Feature: Validation messages
  In order to test Application page
  As not registered user
  I want to see validation messages for mandatory fields


  Scenario: Validation message shown when mandatory fields are not populated
    Given user is on application page
    When user clicks on Submit button
    Then validation message is get

  Scenario: Validation message removed when valid option is selected
    Given user is on application page
    When user clicks on Submit button
    And user selects valid education option
    Then validation message is removed
