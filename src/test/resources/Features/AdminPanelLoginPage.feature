@s
Feature: To verify Login & Logout functionality

  Background: 
    Given user is on Admin login page

  @s1
  Scenario Outline: To verify  login
    When users enter <username> and <password>
    And clicks on login
    Then user is navigated to home page

    Examples: 
      | username                   | password |
      | abhishek.kumar@racknap.com | Abhi2213 |
      | demo123                    | Abhi2213 |

  @s2
  Scenario Outline: To verify logout
    When users enter <username> and <password>
    And clicks on login
    Then user is navigated to home page
    Then user logout

    Examples: 
      | username  | password |
      | demo-user | Abhi@2213 |
