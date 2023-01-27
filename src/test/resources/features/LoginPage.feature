Feature: Login HRM Applicaion

#  Background:
#    Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/"

#    @ValidCredentials
#    Scenario: Login with valid credentials
#
#      When User enters username as "Admin" and password as "admin123"
#      Then User should be able to login sucessfully and new page open
#
#    @InvalidCredentials
#    Scenario Outline: Login with invalid credentials
#
#      When User enters username as "<username>" and password as "<password>"
#      Then User should be able to see error message "<errorMessage>"
#
#      Examples:
#        | username  | password  | errorMessage        |
#        | Admin     | admin12$$ | Invalid Credentials |
#
#      @MissingUsername
#      Scenario Outline: Login with blank username
#
#        When User enters username as " " and passwordas "admin123"
#        Then User should be able to see a message "Required1" below Username
#        Examples:
#          |  |

  Scenario: Login with valid ce
    Given user on Login page
    Then user is on login page
    Then user enters username and password
    Then user clicks on login button
    Then new page open
