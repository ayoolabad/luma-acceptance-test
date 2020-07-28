@LogIn
Feature: Log In

  Scenario Outline: Log into account.
    Given user is on Sign In page
    When user enters the "<Email>" address
    And user inputs the "<Password>"
    And user clicks on Sign In page
    Then user MyDashboard page is displayed


    Examples:
      | Email                    | Password      |
      | baddie2abdul@hotmail.com | Badbadabdul04 |



