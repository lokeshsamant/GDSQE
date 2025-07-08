package com.db.step_def;

import java.time.Duration;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.db.config.ConfigurationManager;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import io.appium.java_client.AppiumDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AbstractBase {
	WebDriver driver;
	AppiumDriver mobileDriver;
	String homePageURL;
	String browserName;
	String mobileExecution;
	WebDriverWait wait;
	private static final Logger logger = LoggerFactory.getLogger(AbstractBase.class);

	@Before
	public void Setup() {

		browserName = ConfigurationManager.getProperty("browser");
		mobileExecution = ConfigurationManager.getProperty("mobile");
		homePageURL = ConfigurationManager.getProperty("url");

		if ("true".equalsIgnoreCase(mobileExecution)) {
			// Mobile Browser size setup
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			Map<String, Object> mobileEmulation = new java.util.HashMap<>();
			mobileEmulation.put("width", 428);
			mobileEmulation.put("height", 926);
			mobileEmulation.put("pixelRatio", 3.0);
			options.setExperimentalOption("mobileEmulation", mobileEmulation);
			driver = new ChromeDriver(options);
			driver.manage().window().setSize(new Dimension(390, 844));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // Apply for mobile driver too
		} else {
			// Desktop Browser Setup
			if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				driver = new ChromeDriver(options);
			} else if (browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}

			if (driver != null) {
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			}
		}
	}

	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			try {
				if (driver != null) {
					final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
					scenario.embed(screenshot, "image/png");
				}
			} catch (Exception e) {
				logger.warn("Failed to capture screenshot", e);
			}
		}

		if (driver != null) {
			driver.quit();
		}
	}

	public WebDriver getDriver() {
		if (driver == null) {
			driver = new ChromeDriver();
		}
		return driver;
	}

	public String getLandingPageURL() {
		return homePageURL;
	}
}
