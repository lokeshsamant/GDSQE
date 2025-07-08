package com.db.helpers;

import java.lang.reflect.Field;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class ShadowDOMElementLocatorFactory implements ElementLocatorFactory {
	private WebDriver driver;

	public ShadowDOMElementLocatorFactory(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public ElementLocator createLocator(Field field) {
		FindBy findBy = field.getAnnotation(FindBy.class);
		if (findBy != null) {
			if (!findBy.xpath().isEmpty()) {
				return new ShadowDOMElementLocator(driver, By.xpath(findBy.xpath()));
			} else if (!findBy.css().isEmpty()) {
				return new ShadowDOMElementLocator(driver, By.cssSelector(findBy.css()));
			}
		}
		return null;
	}

}
