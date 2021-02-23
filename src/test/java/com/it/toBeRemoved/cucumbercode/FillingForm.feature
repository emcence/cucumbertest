Feature: Fill in a form on a webpage

  @testing
  Scenario: Login as authenticated user
    Given user is on form page
    When user fill in name and job title
    And user enters level of education
    And user enters gender
    And user enters years of experience
    And add date
    And press submit button
    Then success message is displayed