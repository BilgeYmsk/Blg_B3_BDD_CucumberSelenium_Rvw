Feature: Login Test-the user should be able to login with valid credential

  Background:
    Given the user is on the login page

  @loginWithOutParameters
  Scenario: Positive scenario 1-user should be able to login
    When  the user enters valid credentials
    Then verify "Welcome blg"

  @loginWithParameters
  Scenario: Positive scenario 2-user should be able to login
    When the user enters "blg" and "Test1234!" and click login button
    Then verify "Welcome blg"

  @loginWithScenarioOutline
  Scenario Outline: Positive scenario 3-user should be able to login
    When the user enters "<username>" and "<password>" and click login button
    Then verify "<message>"
    Examples:
      | username | password  | message     |
      | blg      | Test1234! | Welcome blg |


#    datatable ile outline birlesmis hali asagidaki method Map ile inputlari aldik

  @loginWithDataTableAndSCOutline
  Scenario Outline: Positive scenario 4-user should be able to login
    When the user enters valid username and password
      | username | <user>     |
      | password | <password> |
    Then verify "<message>"

    Examples:
      | user            | password  | message                 |
      | blg             | Test1234! | Welcome blg             |
      | etsB3@gmail.com | Test123++ | Welcome etsB3@gmail.com |


    @loginNegative
  Scenario Outline: Negative scenario -User should NOT be able to login with invalid credential
    When the user enters "<invalid username>" and "<invalid password>" and click login button
    Then verify invalid credential "<message>"



    Examples:
      | invalid username | invalid password | message                                |
      | blginvalid       | Test1234!        | User does not exist.                   |
      | blg              | Test!            | Wrong password.                        |
      |                  | Test1234!        | Please fill out Username and Password. |
      | blg              |                  | Please fill out Username and Password. |
      |                  |                  | Please fill out Username and Password. |
      | kdfhödkfjh       | kdsfkf           | User does not exist.                   |
#      | blginvalid       | Test1234!        |password must be at least 8 characters |