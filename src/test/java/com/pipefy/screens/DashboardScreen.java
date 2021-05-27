package com.pipefy.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DashboardScreen extends BaseScreen {

	@AndroidFindBy(id = "text_welcome")
	private MobileElement welcomeLabel;

	@AndroidFindBy(id = "edit_search")
	private MobileElement searchInput;

	public DashboardScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	public SearchScreen searchForExistingPipes(String pipeName) {
		clickOn(searchInput);
		sendValue(searchInput, pipeName);
		return new SearchScreen(driver);
	}

	public boolean dashboardIsVisible() {
		return isElementsVisible(welcomeLabel);
	}
}
