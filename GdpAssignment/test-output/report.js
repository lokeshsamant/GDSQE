$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/db/features/sentimentsFeedbackSubmission.feature");
formatter.feature({
  "name": "Sentiments Widget Feedback Submission - Basic Flows",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Submit feedback successfully with a high or low rating",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user selects the \"\u003crating type\u003e\" rating",
  "keyword": "When "
});
formatter.step({
  "name": "the user chooses the respective contributing areas",
  "keyword": "And "
});
formatter.step({
  "name": "the user submits the feedback",
  "keyword": "And "
});
formatter.step({
  "name": "the feedback should be submitted successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "rating type"
      ]
    },
    {
      "cells": [
        "Low"
      ]
    },
    {
      "cells": [
        "High"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the WOGAA Documentation website",
  "keyword": "Given "
});
formatter.match({
  "location": "TodoSteps.theUserIsOnTheWogaaDocumentationWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Sentiments widget is visible",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theSentimentsWidgetIsVisible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the \u0027Help us improve\u0027 ribbon button",
  "keyword": "When "
});
formatter.match({
  "location": "TodoSteps.theUserClicksTheHelpUsImproveRibbonButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Submit feedback successfully with a high or low rating",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user selects the \"Low\" rating",
  "keyword": "When "
});
formatter.match({
  "location": "TodoSteps.theUserSelectsTheRating(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user chooses the respective contributing areas",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theUserChoosesRandomContributingAreasForTheSelectedRatingType()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user submits the feedback",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theUserSubmitsTheFeedback()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the feedback should be submitted successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TodoSteps.theFeedbackShouldBeSubmittedSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the WOGAA Documentation website",
  "keyword": "Given "
});
formatter.match({
  "location": "TodoSteps.theUserIsOnTheWogaaDocumentationWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Sentiments widget is visible",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theSentimentsWidgetIsVisible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the \u0027Help us improve\u0027 ribbon button",
  "keyword": "When "
});
formatter.match({
  "location": "TodoSteps.theUserClicksTheHelpUsImproveRibbonButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Submit feedback successfully with a high or low rating",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user selects the \"High\" rating",
  "keyword": "When "
});
formatter.match({
  "location": "TodoSteps.theUserSelectsTheRating(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user chooses the respective contributing areas",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theUserChoosesRandomContributingAreasForTheSelectedRatingType()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user submits the feedback",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theUserSubmitsTheFeedback()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the feedback should be submitted successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TodoSteps.theFeedbackShouldBeSubmittedSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Submit feedback successfully with different rating and interest",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user selects a rating of \u003crating\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "the user chooses the contributing areas: \"\u003ccontributing areas\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user indicates their interest as \"\u003cinterest\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user submits the feedback",
  "keyword": "And "
});
formatter.step({
  "name": "the feedback should be submitted successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "rating",
        "contributing areas",
        "interest"
      ]
    },
    {
      "cells": [
        "6",
        "Website loaded fast, Easy to navigate",
        "Mobile Applications, Informational Servicess"
      ]
    },
    {
      "cells": [
        "5",
        "Easy to find content",
        "Transactional Services"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the WOGAA Documentation website",
  "keyword": "Given "
});
formatter.match({
  "location": "TodoSteps.theUserIsOnTheWogaaDocumentationWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Sentiments widget is visible",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theSentimentsWidgetIsVisible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the \u0027Help us improve\u0027 ribbon button",
  "keyword": "When "
});
formatter.match({
  "location": "TodoSteps.theUserClicksTheHelpUsImproveRibbonButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Submit feedback successfully with different rating and interest",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user selects a rating of 6",
  "keyword": "When "
});
formatter.match({
  "location": "TodoSteps.theUserSelectsARatingOf(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user chooses the contributing areas: \"Website loaded fast, Easy to navigate\"",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theUserChoosesTheContributingAreas(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user indicates their interest as \"Mobile Applications, Informational Servicess\"",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theUserIndicatesTheirInterestAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user submits the feedback",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theUserSubmitsTheFeedback()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the feedback should be submitted successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TodoSteps.theFeedbackShouldBeSubmittedSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the WOGAA Documentation website",
  "keyword": "Given "
});
formatter.match({
  "location": "TodoSteps.theUserIsOnTheWogaaDocumentationWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Sentiments widget is visible",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theSentimentsWidgetIsVisible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the \u0027Help us improve\u0027 ribbon button",
  "keyword": "When "
});
formatter.match({
  "location": "TodoSteps.theUserClicksTheHelpUsImproveRibbonButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Submit feedback successfully with different rating and interest",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user selects a rating of 5",
  "keyword": "When "
});
formatter.match({
  "location": "TodoSteps.theUserSelectsARatingOf(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user chooses the contributing areas: \"Easy to find content\"",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theUserChoosesTheContributingAreas(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user indicates their interest as \"Transactional Services\"",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theUserIndicatesTheirInterestAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user submits the feedback",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theUserSubmitsTheFeedback()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the feedback should be submitted successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TodoSteps.theFeedbackShouldBeSubmittedSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Submit feedback successfully with a low rating",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user selects a rating of \u003crating\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "the user chooses the contributing areas: \"\u003ccontributing areas\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user indicates their interest as \"\u003cinterest\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user submits the feedback",
  "keyword": "And "
});
formatter.step({
  "name": "the feedback should be submitted successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "rating",
        "contributing areas",
        "interest"
      ]
    },
    {
      "cells": [
        "1",
        "Content not clear, Website loaded slowly",
        ""
      ]
    },
    {
      "cells": [
        "2",
        "Couldn\u0027t find content, Difficult to navigate",
        "Mobile Applications, Informational Services"
      ]
    },
    {
      "cells": [
        "3",
        "Content not clear",
        "Informational Services"
      ]
    },
    {
      "cells": [
        "4",
        "Technical errors",
        "Transactional Services"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the WOGAA Documentation website",
  "keyword": "Given "
});
formatter.match({
  "location": "TodoSteps.theUserIsOnTheWogaaDocumentationWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Sentiments widget is visible",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theSentimentsWidgetIsVisible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the \u0027Help us improve\u0027 ribbon button",
  "keyword": "When "
});
formatter.match({
  "location": "TodoSteps.theUserClicksTheHelpUsImproveRibbonButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Submit feedback successfully with a low rating",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user selects a rating of 1",
  "keyword": "When "
});
formatter.match({
  "location": "TodoSteps.theUserSelectsARatingOf(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user chooses the contributing areas: \"Content not clear, Website loaded slowly\"",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theUserChoosesTheContributingAreas(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user indicates their interest as \"\"",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theUserIndicatesTheirInterestAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user submits the feedback",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theUserSubmitsTheFeedback()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the feedback should be submitted successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TodoSteps.theFeedbackShouldBeSubmittedSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the WOGAA Documentation website",
  "keyword": "Given "
});
formatter.match({
  "location": "TodoSteps.theUserIsOnTheWogaaDocumentationWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Sentiments widget is visible",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theSentimentsWidgetIsVisible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the \u0027Help us improve\u0027 ribbon button",
  "keyword": "When "
});
formatter.match({
  "location": "TodoSteps.theUserClicksTheHelpUsImproveRibbonButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Submit feedback successfully with a low rating",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user selects a rating of 2",
  "keyword": "When "
});
formatter.match({
  "location": "TodoSteps.theUserSelectsARatingOf(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user chooses the contributing areas: \"Couldn\u0027t find content, Difficult to navigate\"",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theUserChoosesTheContributingAreas(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user indicates their interest as \"Mobile Applications, Informational Services\"",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theUserIndicatesTheirInterestAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user submits the feedback",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theUserSubmitsTheFeedback()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the feedback should be submitted successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TodoSteps.theFeedbackShouldBeSubmittedSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the WOGAA Documentation website",
  "keyword": "Given "
});
formatter.match({
  "location": "TodoSteps.theUserIsOnTheWogaaDocumentationWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Sentiments widget is visible",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theSentimentsWidgetIsVisible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the \u0027Help us improve\u0027 ribbon button",
  "keyword": "When "
});
formatter.match({
  "location": "TodoSteps.theUserClicksTheHelpUsImproveRibbonButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Submit feedback successfully with a low rating",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user selects a rating of 3",
  "keyword": "When "
});
formatter.match({
  "location": "TodoSteps.theUserSelectsARatingOf(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user chooses the contributing areas: \"Content not clear\"",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theUserChoosesTheContributingAreas(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user indicates their interest as \"Informational Services\"",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theUserIndicatesTheirInterestAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user submits the feedback",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theUserSubmitsTheFeedback()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the feedback should be submitted successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TodoSteps.theFeedbackShouldBeSubmittedSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the WOGAA Documentation website",
  "keyword": "Given "
});
formatter.match({
  "location": "TodoSteps.theUserIsOnTheWogaaDocumentationWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Sentiments widget is visible",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theSentimentsWidgetIsVisible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the \u0027Help us improve\u0027 ribbon button",
  "keyword": "When "
});
formatter.match({
  "location": "TodoSteps.theUserClicksTheHelpUsImproveRibbonButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Submit feedback successfully with a low rating",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user selects a rating of 4",
  "keyword": "When "
});
formatter.match({
  "location": "TodoSteps.theUserSelectsARatingOf(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user chooses the contributing areas: \"Technical errors\"",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theUserChoosesTheContributingAreas(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user indicates their interest as \"Transactional Services\"",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theUserIndicatesTheirInterestAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user submits the feedback",
  "keyword": "And "
});
formatter.match({
  "location": "TodoSteps.theUserSubmitsTheFeedback()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the feedback should be submitted successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TodoSteps.theFeedbackShouldBeSubmittedSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});