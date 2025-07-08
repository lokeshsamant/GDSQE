package com.db.helpers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableList;

public class ElementHelpers {

	private final WebDriver driver;
	private final JavascriptExecutor js;
	private final Actions actions;
	private WebDriverWait wait;

	public ElementHelpers(WebDriver driver) {
		actions = new Actions(driver);
		js = ((JavascriptExecutor) driver);
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
	}

	public void click(By locator) {
		click(locator, WaitHelpers.MEDIUM_WAIT);
	}

	public void click(By locator, Duration waitTime) {
		var wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}

	public void click(WebElement element) {
		var wait = new WebDriverWait(driver, WaitHelpers.MEDIUM_WAIT);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public void scrollAndClick(By locator) {
		scrollToCenter(locator);
		click(locator, WaitHelpers.MEDIUM_WAIT);
	}

	public void scrollAndJsClick(By locator) {
		scrollToCenter(locator);
		jsClick(locator);
	}

	public void rightClick(By locator) {
		var wait = new WebDriverWait(driver, WaitHelpers.MEDIUM_WAIT);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		rightClick(driver.findElement(locator));
	}

	public void rightClick(WebElement element) {
		var wait = new WebDriverWait(driver, WaitHelpers.MEDIUM_WAIT);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		actions.contextClick(element).perform();
	}

	public void jsClick(By locator) {
		var wait = new WebDriverWait(driver, WaitHelpers.MEDIUM_WAIT);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		var element = driver.findElement(locator);
		js.executeScript("arguments[0].click()", element);
	}

	public void jsClick(WebElement element) {
		var wait = new WebDriverWait(driver, WaitHelpers.MEDIUM_WAIT);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		js.executeScript("arguments[0].click()", element);
	}

	public void sendKeys(By locator, String value) {
		var wait = new WebDriverWait(driver, WaitHelpers.MEDIUM_WAIT);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		var element = driver.findElement(locator);
		element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		element.sendKeys(value);
	}

	public void sendKeys(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public void scrollIntoView(By locator) {
		var wait = new WebDriverWait(driver, WaitHelpers.LONG_WAIT);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		var element = driver.findElement(locator);
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public void scrollIntoView(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public void scrollToBottom() {
		js.executeScript("window.scrollTo(0, 9999)");
	}

	public void scrollToTop() {
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
	}

	public void scrollToLocation(int x, int y) {
		js.executeScript(String.format("window.scrollTo(%d, %d)", x, y));
	}

	public void scrollToCenter(By locator) {
		var wait = new WebDriverWait(driver, WaitHelpers.LONG_WAIT);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		scrollToCenterOfWebElement(element);
	}

	public void scrollToCenter(By locator, Duration waitTime) {
		var wait = new WebDriverWait(driver, waitTime);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		scrollToCenterOfWebElement(element);
	}

	public void scrollToCenterOfWebElement(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", element);
	}

	public boolean isElementPresent(By locator) {
		return isElementPresent(locator, WaitHelpers.MEDIUM_WAIT);
	}

	public boolean isElementPresent(By locator, Duration waitTime) {
		var wait = new WebDriverWait(driver, waitTime);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			return driver.findElement(locator).isEnabled();
		} catch (RuntimeException ex) {
			return false;
		}
	}

	public boolean isElementNotPresent(By locator) {
		return !isElementPresent(locator);
	}

	public boolean isEnabled(WebElement element) {
		return element.isEnabled();
	}

	public List<WebElement> getAllElements(By locator) {
		return driver.findElements(locator);
	}

	public String getText(By locator) {
		var wait = new WebDriverWait(driver, WaitHelpers.MEDIUM_WAIT);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator)).getText();
	}

	public String getText(WebElement element) {
		return element.getText();
	}

	public String getText(By locator, Duration waitTime) {
		var wait = new WebDriverWait(driver, waitTime);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator)).getText();
	}

	public WebElement findElement(By locator) {
		var wait = new WebDriverWait(driver, WaitHelpers.MEDIUM_WAIT);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return driver.findElement(locator);
	}

	public String getAttributeOfElement(WebElement element, String attribute) {
		return element.getAttribute(attribute);
	}

	public String getAttributeOfElement(By locator, String attribute) {
		return getAttributeOfElement(findElement(locator), attribute);
	}

	public void waitForElementToBeDisappear(By locator) {
		waitForElementToBeDisappear(locator, WaitHelpers.MEDIUM_WAIT);
	}

	public void waitForElementToBeDisappear(By locator, Duration waitTime) {
		var wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}

	public void waitForElementToBeVisible(By locator, Duration waitTime) {
		var wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void waitForElementToBeClickable(By locator, Duration waitTime) {
		var wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void waitForElementToBeClickable(By locator) {
		waitForElementToBeClickable(locator, WaitHelpers.MEDIUM_WAIT);
	}

	public void waitForElementToBeVisible(By locator) {
		waitForElementToBeVisible(locator, WaitHelpers.LONG_WAIT);
	}

	public void zoomInAndOutOfPage(int percentage) {
		js.executeScript("document.body.style.zoom = '" + percentage + "%'");
	}

	public boolean isClickable(By locator) {
		var wait = new WebDriverWait(driver, WaitHelpers.MEDIUM_WAIT);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		return true;
	}

	public boolean isVisible(WebElement webElement) {
		return webElement.isDisplayed();
	}

	public void mouseHover(By locator) {
		var wait = new WebDriverWait(driver, WaitHelpers.MEDIUM_WAIT);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		WebElement element = driver.findElement(locator);
		actions.moveToElement(element).perform();
	}

	public void pageDown() {
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
	}

	public void pageUp() {
		actions.sendKeys(Keys.PAGE_UP).build().perform();
	}

	public void scrollToCenterAndSendKeys(By locator, String value) {
		scrollToCenter(locator);
		click(locator);
		sendKeys(locator, value);
	}

	public ImmutableList<WebElement> findElementsWithTimeout(By locator, Duration waitTime) {
		var wait = new WebDriverWait(driver, waitTime);
		try {
			return ImmutableList.copyOf(wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator)));
		} catch (RuntimeException ex) {
			return ImmutableList.of();
		}
	}

	public boolean isElementDisplayed(WebElement webElement) {
		try {
			return wait.until(ExpectedConditions.visibilityOf(webElement)).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
}
