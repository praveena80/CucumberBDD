Feature: Create Account

#  Scenario Outline: Create Account
#    Given User on home page
#    When user selects sign up
#    Then user provides all the required information and clicks on Save button "<userName>"
#    Then Confirmation message will display "<confirmMsg>"
#    Examples:
#      | userName | confirmMsg                                       |
#      | abcxyz   | Your account has been created. Please try login. |

  Scenario: Create Account With different info
    Given user selects sign up
    When user provides all the required information and clicks on Save button "testR"
    Then Confirmation message will display "Your account has been created. Please try login."
