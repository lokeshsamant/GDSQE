package com.db.helpers;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShadowDOMUtils {

	private WebDriver driver;

	WebDriverWait wait;

	public ShadowDOMUtils(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
	}

	public SearchContext getShadowRootOfWogSentiments() {
		WebElement wogSentimentsElement = driver.findElement(By.cssSelector("wog-sentiments"));
		return wogSentimentsElement.getShadowRoot();
	}
}
