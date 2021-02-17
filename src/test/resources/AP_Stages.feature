Feature: Stage messages
  In order to test 5 stages on Application page
  As not registered user
  I want to see appropriate text when i click on the stage number


  Scenario: Stage 1
    Given user is on application page
    When user clicks on stage 1
    Then text for stage 1 is shown

  Scenario: Stage 2
    Given user is on application page
    When user clicks on stage 2
    Then text for stage 2 is shown

  Scenario: Stage 3
    Given user is on application page
    When user clicks on stage 3
    Then text for stage 3 is shown

  Scenario: Stage 4
    Given user is on application page
    When user clicks on stage 4
    Then text for stage 4 is shown

  Scenario: Stage 5
    Given user is on application page
    When user clicks on stage 5
    Then text for stage 5 is shown

  Scenario: Correct link is opened from stage 5
    Given user is on application page
    When user clicks on stage 5
    And user clicks on apply here button
    Then kurskatalog page is opened

  Scenario: All stages and shown link
    Given user is on application page
    When user clicks on stage 1
    And user clicks on stage 2
    And user clicks on stage 3
    And user clicks on stage 4
    And user clicks on stage 5
    And user clicks on apply here button
    Then kurskatalog page is opened