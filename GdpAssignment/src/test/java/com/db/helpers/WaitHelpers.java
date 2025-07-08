package com.db.helpers;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.util.concurrent.Uninterruptibles;

public final class WaitHelpers {
	private final WebDriver driver;
	public static final Duration LONG_WAIT = Duration.ofMinutes(1);
	public static final Duration MEDIUM_WAIT = Duration.ofSeconds(15);
	public static final Duration MEDIUM_LONG_WAIT = Duration.ofSeconds(30);
	public static final Duration SHORT_WAIT = Duration.ofSeconds(5);
	public static final Duration PULSE_WAIT = Duration.ofSeconds(1);
	public static final Duration SHORTER_WAIT = Duration.ofSeconds(3);

	public WaitHelpers(WebDriver driver) {
		this.driver = driver;
	}

	public void defaultWait() {
		Uninterruptibles.sleepUninterruptibly(SHORT_WAIT.toMillis(), TimeUnit.MILLISECONDS);
	}

	public void shorterWait() {
		Uninterruptibles.sleepUninterruptibly(SHORTER_WAIT.toMillis(), TimeUnit.MILLISECONDS);
	}

	public void pulseWait() {
		Uninterruptibles.sleepUninterruptibly(PULSE_WAIT.toMillis(), TimeUnit.MILLISECONDS);
	}

	public void mediumWait() {
		Uninterruptibles.sleepUninterruptibly(MEDIUM_WAIT.toMillis(), TimeUnit.MILLISECONDS);
	}

	public void mediumLongWait() {
		Uninterruptibles.sleepUninterruptibly(MEDIUM_LONG_WAIT.toMillis(), TimeUnit.MILLISECONDS);
	}

	public void longWait() {
		Uninterruptibles.sleepUninterruptibly(LONG_WAIT.toMillis(), TimeUnit.MILLISECONDS);
	}

	public String waitForUrlToChange(Runnable work, Duration timeout) {
		final String originalUrl = driver.getCurrentUrl();
		work.run();
		var wait = new WebDriverWait(driver, timeout);
		wait.until((WebDriver driver) -> !driver.getCurrentUrl().equals(originalUrl));
		return driver.getCurrentUrl();
	}

	public void waitForNavigation(Runnable work, Duration timeout) {
		((JavascriptExecutor) driver).executeScript("window.saveAsDraftButton = true");
		work.run();
		var wait = new WebDriverWait(driver, timeout);
		wait.until((WebDriver driver) -> !((Boolean) ((JavascriptExecutor) driver)
				.executeScript("return window.saveAsDraftButton === true")));
	}

	public void waitForPresenceOf(By by) {
		waitForPresenceOf(by, MEDIUM_WAIT);
	}

	public void waitForPresenceOf(By by, Duration timeout) {
		var wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
	}

	public void waitForASpecifiedDuration(Duration duration) {
		Uninterruptibles.sleepUninterruptibly(duration.toMillis(), TimeUnit.MILLISECONDS);
	}
}
