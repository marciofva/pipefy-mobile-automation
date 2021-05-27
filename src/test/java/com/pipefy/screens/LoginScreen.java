package com.pipefy.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginScreen extends BaseScreen {

	@AndroidFindBy(id = "input_field")
	private MobileElement userInput;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	private MobileElement passwordInput;

	@AndroidFindBy(id = "button_login")
	private MobileElement loginBtn;

	public LoginScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	public DashboardScreen loginToSystem(String user, String password) {
		sendValue(userInput, user);
		sendValue(passwordInput, password);
		clickOn(loginBtn);
		return new DashboardScreen(driver);
	}
}
