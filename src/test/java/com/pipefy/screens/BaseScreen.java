package com.pipefy.screens;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public abstract class BaseScreen {

	private static final int MAX_TIMEOUT = 40;
	protected AppiumDriver<MobileElement> driver;
	private WebDriverWait wait;

	public BaseScreen(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
		this.wait = new WebDriverWait(driver, MAX_TIMEOUT);
	}

	protected void sendValue(MobileElement element, CharSequence value) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(value);
	}

	protected void clickOn(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	protected boolean isElementsVisible(MobileElement... elements) {
		for (MobileElement element : elements) {
			wait.until(ExpectedConditions.visibilityOf(element));
			if (!element.isDisplayed()) {
				Logger.getGlobal().info("Element not visible: ".concat(element.getId()));
				return false;
			}
		}
		return true;
	}

	protected List<WebElement> waitListOfElementsVisible(List<WebElement> listElements) {
		return wait.until(ExpectedConditions.visibilityOfAllElements(listElements));
	}
}
