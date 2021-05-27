package com.pipefy.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OnboardingScreen extends BaseScreen {

	@AndroidFindBy(id = "button_login")
	private MobileElement connectBtn;

	public OnboardingScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	public LoginScreen goToLoginPage() {
		clickOn(connectBtn);
		return new LoginScreen(driver);
	}
}
