Feature: This feature would be used to design the Login page of the application

  Background: Open the application
    Given I have opened the application in browser

@Sanity
  Scenario: Validate the successful login
    When I click on the Login link
    And I enter username
    And I enter password
    And I click on the login Button
    Then I should be Landed on the home page
@Sanity @Rapid
  Scenario: Validate the successful login using test data
    When I click on the Login link
    And I enter username "shash12@gmail.com"
    And I enter password "PG@12ahdD1"
    And I click on the login Button
    Then I should be Landed on the home page

  Scenario Outline: Validate the successful login using multiple test data
    When I click on the Login link
    And I enter username "<username>"
    And I enter password "<password>"
    And I click on the login Button
    Then I should be Landed on the home page

    Examples: 
      | username         |  | password     |
      | sndfgn@gmail.com |  | s!NDdnfjf@12 |
      | szd@gmail.com    |  | sdnSDs$35    |
      
@Regression
  Scenario: Validare the negative login using test data
    When I click on the Login link
    And I enter username "shash12@gmail.com"
    And I enter password "PG@12ahdD1"
    And I click on the login Button
    Then I should get message as "The email or password you have entered is invalid."
