Feature: Sentiments Widget Feedback Submission - Validation and Edge Cases

  Background:
    Given the user is on the WOGAA Documentation website
    And the Sentiments widget is visible
    When the user clicks the 'Help us improve' ribbon button

  Scenario: Mandatory field missing (contributed area)
    When the user selects a rating of 1
    Then the user should not be able to submit the feedback

  Scenario: 'Others' area selected but no details
    When the user selects a rating of 4
    And the user chooses the contributing areas: "Others"
    Then the user should not be able to submit the feedback

  Scenario: 'Other' interest selected but no details
    When the user selects a rating of 6
    And the user chooses the contributing areas: "Website loaded fast"
    And the user indicates their interest as "other"
    And the user should see an error message for the required other field
    Then the user should not be able to submit the feedback

  Scenario: Widget dismissed
    When the user clicks the 'X' button to close the widget
    Then the Sentiments widget should be dismissed

  Scenario: Navigating away before submission
    When the user selects a rating of 3
    And the user chooses the contributing areas: "Others"
    And the user navigates to a different page on the website
    Then the Sentiments widget state should be reset upon navigation

  Scenario: Character limit exceeded in feedback text
    When the user selects a rating of 2
    And the user chooses the contributing areas: "Content not clear"
    And the user provides very lengthy feedback on what they liked least
    Then the user should see an alert for the exceeded characters
    And the user should not be able to submit the feedback

  Scenario Outline: Invalid email format
    When the user selects a rating of 1
    And the user chooses the contributing areas: "Technical errors"
    And the user enters their email address as "<email>"
    Then the user should see an error message for the email field
    And the user should not be able to submit the feedback

    Examples:
      | email                    |
      | test_user_two            |
      | test_user_two@wogaa      |
      | test_user_twowogaa.sg    |
      | test_user_two@wogaa.sg.  |
