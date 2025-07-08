Feature: Sentiments Widget Feedback Submission - Basic Flows

  Background:
    Given the user is on the WOGAA Documentation website
    And the Sentiments widget is visible
    When the user clicks the 'Help us improve' ribbon button

  Scenario Outline: Submit feedback successfully with a high or low rating
    When the user selects the "<rating type>" rating
    And the user chooses the respective contributing areas
    And the user submits the feedback
    Then the feedback should be submitted successfully

    Examples:
      | rating type |
      | Low         |
      | High        |

  Scenario Outline: Submit feedback successfully with different rating and interest
    When the user selects a rating of <rating>
    And the user chooses the contributing areas: "<contributing areas>"
    And the user indicates their interest as "<interest>"
    And the user submits the feedback
    Then the feedback should be submitted successfully

    Examples:
      | rating | contributing areas                    | interest                                     |
      | 6      | Website loaded fast, Easy to navigate | Mobile Applications, Informational Servicess |
      | 5      | Easy to find content                  | Transactional Services                       |

  Scenario Outline: Submit feedback successfully with a low rating
    When the user selects a rating of <rating>
    And the user chooses the contributing areas: "<contributing areas>"
    And the user indicates their interest as "<interest>"
    And the user submits the feedback
    Then the feedback should be submitted successfully

    Examples:
      | rating | contributing areas                           | interest                                    |
      | 1      | Content not clear, Website loaded slowly     |                                             |
      | 2      | Couldn't find content, Difficult to navigate | Mobile Applications, Informational Services |
      | 3      | Content not clear                            | Informational Services                      |
      | 4      | Technical errors                             | Transactional Services                      |
