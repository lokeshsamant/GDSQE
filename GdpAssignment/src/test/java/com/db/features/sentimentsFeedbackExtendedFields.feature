Feature: Sentiments Widget Feedback Submission - Extended Fields and Validations

  Background:
    Given the user is on the WOGAA Documentation website
    And the Sentiments widget is visible
    When the user clicks the 'Help us improve' ribbon button

  Scenario Outline: Submit feedback with least liked description and email
    When the user selects a rating of <rating>
    And the user chooses the contributing areas: "<contributing areas>"
    And the user indicates their interest as "<interest>"
    And the user provides feedback on what they liked least: "<least liked description>"
    And the user enters their email address as "<email>"
    And the user submits the feedback
    Then the feedback should be submitted successfully

    Examples:
      | rating | contributing areas                  | interest               | least liked description                  | email                      |
      | 5      | Content was clear, Website is great | Transactional Services | Improvement can be done in UI            | test_user_five@wogaa.sg    |
      | 1      | Website loaded slowly               | Mobile Applications    | No data was displayed until whitelisting |                            |
      | 3      | Technical errors                    | Informational Services |                                          | test_user_three@wogaa.sg   |

  Scenario: Submit feedback with 'Others' contributed area and interest fields
    When the user selects a rating of 5
    And the user chooses the contributing areas: "Others"
    And the user provides contribution area as "Nice user interface"
    And the user indicates their interest as "other"
    And the user provides interested area as "Documentation Service"
    And the user enters their email address as "test_user_five@wogaa.sg"
    And the user submits the feedback
    Then the feedback should be submitted successfully

  Scenario: Submit feedback with 'Others' contributing area only
    When the user selects a rating of 2
    And the user chooses the contributing areas: "Others"
    And the user provides contribution area as "Poor user interface"
    And the user submits the feedback
    Then the feedback should be submitted successfully
