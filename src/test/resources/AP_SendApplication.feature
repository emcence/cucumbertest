Feature: Send application
  In order to test Application functionality
  As not registered user
  I want to be able to populate fields and send the application

  Scenario: Send application with valid values
    Given user is on application page
    And user selects valid education option
    And user selects gender
    And user types first name
    And user types last name
    And user types personal number
    And user types post number
    And user types postaddress
    And user types email address
    And user types telefonNumber
    When user clicks on Submit button
    Then successful message is displayed

  Scenario: Send application data using table
    Given user is on application page
    And user selects valid education option
    And user selects gender
    And user enters following data
      | firstName | lastName  | personalNumber | postNumber | postAddress | email          | telNumber  |
      | Lina      | Spasovska | 201811081523   | 18273      | Morbydalen  | test@gmail.com | 0736002255 |
    When user clicks on Submit button
    Then validation message is shown

  Scenario Outline: Send application with invalid values
    Given user is on application page
    And user selects valid education option
    And user selects gender
    And user enters <firstName> and <lastName> and <personalNumber> and <postNumber> and <postAddress> and <email> and <telNumber>
    When user clicks on Submit button
    Then validation message is shown

    Examples:
      | firstName | lastName  | personalNumber | postNumber | postAddress | email          | telNumber     |
      | Lina      | Spasovska | 201811081523   | 18273      | Morbydalen  | test@gmail.com | abcdefghijklm |
      | Iv@       | Sp@sovsk! | 201811081523   | 18273      | Morbydalen  | test@gmail.com | 0736547895    |
      | Emi       | Petreska  | yyyymmdd1234   | 18273      | Morbydalen  | test@gmail.com | 0736547896    |
      | Miki      | Spasovski | yyyymmdd1234   | ascvd      | Morbydalen  | test@gmail.com | 0736547896    |
