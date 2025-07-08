package com.db.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import java.util.List;

import org.openqa.selenium.*;

public class ShadowDOMElementLocator implements ElementLocator {

	private final WebDriver driver;
	private final By locator;

	public ShadowDOMElementLocator(WebDriver driver, By locator) {
		this.driver = driver;
		this.locator = locator;
	}

	@Override
	public WebElement findElement() {
		SearchContext shadowRoot = new ShadowDOMUtils(driver).getShadowRootOfWogSentiments();
		return shadowRoot.findElement(locator);
	}

	@Override
	public List<WebElement> findElements() {
		SearchContext shadowRoot = new ShadowDOMUtils(driver).getShadowRootOfWogSentiments();
		return shadowRoot.findElements(locator);
	}
}
