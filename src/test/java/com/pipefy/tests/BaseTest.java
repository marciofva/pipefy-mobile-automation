package com.pipefy.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.pipefy.factory.DriverFactory;
import com.pipefy.fixtures.LoginCredentials;
import com.pipefy.screens.DashboardScreen;
import com.pipefy.screens.OnboardingScreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseTest {

	public static AppiumDriver<MobileElement> driver;
	public DashboardScreen dashboard;

	@BeforeMethod(alwaysRun = true)
	@Parameters({ "platform", "deviceName" })
	public void setup(String platform, String deviceName) {
		driver = DriverFactory.getInstance(platform, deviceName);

		dashboard = new OnboardingScreen(driver).goToLoginPage().loginToSystem(
				LoginCredentials.pipefyUser().get("user"), LoginCredentials.pipefyUser().get("password"));
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		driver.quit();
		DriverFactory.setDriver(null);
	}
}
