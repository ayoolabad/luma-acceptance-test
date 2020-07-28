@AccountManagement
Feature: Account Management

  Scenario Outline: Create An Account
    Given user is on create an account page
    When user enters the "<FirstName>"
    And user enters their "<LastName>"
    And user enters the "<Email>" Address
    And user enters the "<Password>" on create account page
    And user enters to confirm the "<ConfirmPassword>"
    And user clicks on CreateAnAccount
    Then user MyAccount page is displayed.




    Examples:
      | FirstName | LastName | Email                   | Password      | ConfirmPassword |
      | Baddie    | Abdul    | baddie2abdul@hotmail.com | Badbadabdul04 | Badbadabdul04   |