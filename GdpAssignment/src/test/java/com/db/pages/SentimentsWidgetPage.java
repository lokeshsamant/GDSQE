package com.db.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.db.helpers.ElementHelpers;
import com.db.helpers.ShadowDOMElementLocatorFactory;
import com.db.helpers.ShadowDOMUtils;
import com.db.step_def.AbstractBase;

public class SentimentsWidgetPage {

	WebDriver driver;
	AbstractBase base;
	WebDriverWait wait;
	ElementHelpers elementHelpers;

	public SentimentsWidgetPage(AbstractBase base) {
		this.base = base;
		this.driver = base.getDriver();
		this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
		PageFactory.initElements(new ShadowDOMElementLocatorFactory(driver), this);
		this.elementHelpers = new ElementHelpers(driver);
	}

	// Locators
	@FindBy(css = ".wog--tabbed-button")
	private WebElement helpUsImproveRibbon;

	@FindBy(css = "input[placeholder='Other option']")
	private WebElement otherInterestedAreaInputField;

	@FindBy(css = "input[placeholder='Elaborate here']")
	private WebElement otherContributingAreaInputField;

	@FindBy(css = "textarea[placeholder='Type your reply here']")
	private WebElement leastLikedDescriptionField;

	@FindBy(css = "input[placeholder='Type your email here']")
	private WebElement emailInputField;

	@FindBy(css = ".wog--text-theme-red")
	private WebElement lenthyCharactersAlert;

	@FindBy(css = "p[aria-label*='Alert, Please enter a valid email']")
	private WebElement invalidEmailErrorMessage;

	@FindBy(css = "#wogSubmitForm")
	private WebElement submitButton;

	@FindBy(css = "wog-thank-you")
	private WebElement successfulSubmissionMessage;

	@FindBy(css = "button[aria-label*='Close']")
	private WebElement closeButton;

	@FindBy(css = "p[aria-label='Alert, other is a required field']")
	private WebElement otherDetailsMissingErrorMessage;

	public void redirectToHomePage() throws InterruptedException {
		String landingPageUrl = base.getLandingPageURL();
		driver.get(landingPageUrl);
	}

	public boolean isSentimentsWidgetVisible() {
		return elementHelpers.isElementDisplayed(helpUsImproveRibbon);
	}

	public void clickHelpUsImproveRibbon() {
		elementHelpers.click(helpUsImproveRibbon);
	}

	public void selectRating(int rating) {
		ShadowDOMUtils shadowUtils = new ShadowDOMUtils(driver);
		SearchContext shadowRoot = shadowUtils.getShadowRootOfWogSentiments();
		WebElement ratingButton = shadowRoot.findElement(By.cssSelector("button[data-index='" + (rating - 1) + "']"));
		elementHelpers.click(ratingButton);
	}

	public void chooseContributingAreas(String areas) {
		String[] individualAreas = areas.split(", ");
		for (String area : individualAreas) {
			ShadowDOMUtils shadowUtils = new ShadowDOMUtils(driver);
			SearchContext shadowRoot = shadowUtils.getShadowRootOfWogSentiments();
			List<WebElement> selections = shadowRoot.findElements(By.cssSelector("div.wog--chip"));
			for (WebElement selection : selections) {
				if (selection.getText().trim().equals(area)) {
					elementHelpers.click(selection);
					break;
				}
			}
		}
	}

	public void provideContributionArea(String text) {
		elementHelpers.sendKeys(otherContributingAreaInputField, text);
	}

	public void indicateInterest(String indicateInterests) {
		if (!indicateInterests.isEmpty()) {
			String[] individualIntrest = indicateInterests.split(", ");
			for (String interestedArea : individualIntrest) {
				ShadowDOMUtils shadowUtils = new ShadowDOMUtils(driver);
				SearchContext shadowRoot = shadowUtils.getShadowRootOfWogSentiments();
				WebElement intrestedServices = shadowRoot
						.findElement(By.cssSelector("input[value='" + interestedArea + "']"));
				elementHelpers.click(intrestedServices);
			}
		}
	}

	public void provideInterestedArea(String text) {
		elementHelpers.sendKeys(otherInterestedAreaInputField, text);
	}

	public void submitFeedback() {
		elementHelpers.click(submitButton);
	}

	public boolean isSubmitButtonEnabled() {
		return elementHelpers.isEnabled(submitButton);
	}

	public String isFeedbackSubmittedSuccessfully() {
		return elementHelpers.getText(successfulSubmissionMessage);
	}

	public void provideLeastLikedDescription(String description) {
		if (!description.isEmpty() && !description.equalsIgnoreCase("None")) {
			elementHelpers.sendKeys(leastLikedDescriptionField, description);
		}
	}

	public void enterEmailAddress(String email) {
		if (!email.isEmpty()) {
			elementHelpers.sendKeys(emailInputField, email);
		}
	}

	public void clickCloseButton() {
		elementHelpers.click(closeButton);
	}

	public void navigateToDifferentPage() {
		driver.get(base.getLandingPageURL() + "#introduction");
	}

	public String isOtherFieldRequiredErrorMessageDisplayed() {
		return elementHelpers.getText(otherDetailsMissingErrorMessage);

	}

	public boolean isExceededCharactersAlertDisplayed() {
		return elementHelpers.isElementDisplayed(lenthyCharactersAlert);
	}

	public String isInvalidEmailErrorMessageDisplayed() {
		return elementHelpers.getText(invalidEmailErrorMessage);
	}
}