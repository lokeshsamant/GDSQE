package com.db.step_def;

import com.db.pages.SentimentsWidgetPage;
import com.db.testdata.TestData;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TodoSteps {

	SentimentsWidgetPage sentimentsWidgetPage;
	private Random random = new Random();
	private int selectedRating;

	public TodoSteps(SentimentsWidgetPage sentimentsWidgetPage) {
		this.sentimentsWidgetPage = sentimentsWidgetPage;
	}

	@Given("the user is on the WOGAA Documentation website")
	public void theUserIsOnTheWogaaDocumentationWebsite() throws InterruptedException {
		sentimentsWidgetPage.redirectToHomePage();
	}

	@And("the Sentiments widget is visible")
	public void theSentimentsWidgetIsVisible() {
		Assert.assertTrue("Sentiments widget should be visible", sentimentsWidgetPage.isSentimentsWidgetVisible());
	}

	@When("the user clicks the 'Help us improve' ribbon button")
	public void theUserClicksTheHelpUsImproveRibbonButton() {
		sentimentsWidgetPage.clickHelpUsImproveRibbon();
	}

	@When("the user selects the {string} rating")
	public void theUserSelectsTheRating(String ratingType) {
		List<Integer> ratings = TestData.RATING_TYPE_MAP.get(ratingType); // Accessing from TestData
		if (ratings == null || ratings.isEmpty()) {
			throw new IllegalArgumentException("Invalid rating type: " + ratingType);
		}
		selectedRating = ratings.get(random.nextInt(ratings.size()));
		sentimentsWidgetPage.selectRating(selectedRating);
	}

	@And("the user chooses the respective contributing areas")
	public void theUserChoosesRandomContributingAreasForTheSelectedRatingType() {
		String ratingType;
		if (selectedRating >= 1 && selectedRating <= 4) {
			ratingType = "Low";
		} else if (selectedRating >= 5 && selectedRating <= 6) {
			ratingType = "High";
		} else {
			throw new IllegalStateException("No rating selected or invalid rating value: " + selectedRating);
		}

		List<String> possibleAreas = TestData.CONTRIBUTING_AREAS_MAP.get(ratingType); // Accessing from TestData
		if (possibleAreas == null || possibleAreas.isEmpty()) {
			throw new IllegalArgumentException("No contributing areas defined for rating type: " + ratingType);
		}

		int numberOfAreasToSelect = random.nextInt(Math.min(possibleAreas.size(), 3)) + 1;
		List<String> selectedAreas = random.ints(0, possibleAreas.size()).distinct().limit(numberOfAreasToSelect)
				.mapToObj(possibleAreas::get).collect(Collectors.toList());

		String areasToChoose = String.join(", ", selectedAreas);
		sentimentsWidgetPage.chooseContributingAreas(areasToChoose);
	}

	@When("the user selects a rating of {int}")
	public void theUserSelectsARatingOf(int rating) {
		sentimentsWidgetPage.selectRating(rating);
	}

	@When("the user chooses the contributing areas: {string}")
	public void theUserChoosesTheContributingAreas(String contributingAreas) {
		sentimentsWidgetPage.chooseContributingAreas(contributingAreas);
	}

	@And("the user indicates their interest as {string}")
	public void theUserIndicatesTheirInterestAs(String interests) {
		sentimentsWidgetPage.indicateInterest(interests);
	}

	@And("the user submits the feedback")
	public void theUserSubmitsTheFeedback() {
		sentimentsWidgetPage.submitFeedback();
	}

	@Then("the feedback should be submitted successfully")
	public void theFeedbackShouldBeSubmittedSuccessfully() {
		Assert.assertEquals("Thank you for your feedback!", sentimentsWidgetPage.isFeedbackSubmittedSuccessfully());
	}

	@And("the user provides feedback on what they liked least: {string}")
	public void theUserProvidesFeedbackOnWhatTheyLikedLeast(String leastLikedDescription) {
		sentimentsWidgetPage.provideLeastLikedDescription(leastLikedDescription);
	}

	@And("the user enters their email address as {string}")
	public void theUserEntersTheirEmailAddressAs(String email) {
		sentimentsWidgetPage.enterEmailAddress(email);
	}

	@And("the user provides contribution area as {string}")
	public void theUserProvidesContributionAreaAs(String contributionArea) {
		sentimentsWidgetPage.provideContributionArea(contributionArea);
	}

	@And("the user provides interested area as {string}")
	public void theUserProvidesInterestedAreaAs(String interestedArea) {
		sentimentsWidgetPage.provideInterestedArea(interestedArea);
	}

	@Then("the user should not be able to submit the feedback")
	public void theUserShouldNotBeAbleToSubmitTheFeedback() {
		Assert.assertFalse("Submit button should be disabled or not clickable",
				sentimentsWidgetPage.isSubmitButtonEnabled());
	}

	@When("the user clicks the 'X' button to close the widget")
	public void theUserClicksTheXButtonToCloseTheWidget() {
		sentimentsWidgetPage.clickCloseButton();
	}

	@Then("the Sentiments widget should be dismissed")
	public void theSentimentsWidgetShouldBeDismissed() {
		Assert.assertTrue("Sentiments widget should be dismissed", sentimentsWidgetPage.isSentimentsWidgetVisible());
	}

	@And("the user should see an error message for the required other field")
	public void theUserShouldSeeAnErrorMessageForTheRequiredOtherField() {
		Assert.assertEquals("\"Other\" is a required field.",
				sentimentsWidgetPage.isOtherFieldRequiredErrorMessageDisplayed());
	}

	@When("the user navigates to a different page on the website")
	public void theUserNavigatesToADifferentPageOnTheWebsite() {
		sentimentsWidgetPage.navigateToDifferentPage();
	}

	@Then("the Sentiments widget state should be reset upon navigation")
	public void theSentimentsWidgetStateShouldBeResetUponNavigation() {
		Assert.assertTrue("Sentiments widget should be dismissed/reset upon navigation",
				sentimentsWidgetPage.isSentimentsWidgetVisible());
	}

	@And("the user provides very lengthy feedback on what they liked least")
	public void theUserProvidesVeryLengthyFeedbackOnWhatTheyLikedLeast() {
		String lengthyFeedback = new String(new char[256]).replace('\0', 'A');
		sentimentsWidgetPage.provideLeastLikedDescription(lengthyFeedback);
	}

	@And("the user should see an alert for the exceeded characters")
	public void theUserShouldSeeAnAlertForTheExceededCharacters() {
		Assert.assertTrue("An alert for exceeded characters should be displayed",
				sentimentsWidgetPage.isExceededCharactersAlertDisplayed());
	}

	@And("the user should see an error message for the email field")
	public void theUserShouldSeeAnErrorMessageForTheEmailField() {
		Assert.assertEquals("Please enter a valid email.", sentimentsWidgetPage.isInvalidEmailErrorMessageDisplayed());
	}
}
