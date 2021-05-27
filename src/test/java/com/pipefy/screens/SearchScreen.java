package com.pipefy.screens;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SearchScreen extends BaseScreen {

	@AndroidFindBy(id = "text_pipe_name")
	private List<WebElement> listPipes;

	public SearchScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	public String getFoundPipeName() {
		return waitListOfElementsVisible(listPipes).get(0).getText().trim();
	}

	public int getSizeOfFoundPipe() {
		return waitListOfElementsVisible(listPipes).size();
	}
}
