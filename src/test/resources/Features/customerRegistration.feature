Feature: Customer Registration

  Background: 
    Given user is on marketplace

  Scenario: To verify Customer Registration with Email
    When user click on email
    And user enter firstname
    And user enter lastname
    And user enter number
    And user enter emailid
    And user enter password
    And user enter confirmpassword
    And user click create Account
