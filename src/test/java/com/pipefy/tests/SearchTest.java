package com.pipefy.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pipefy.screens.SearchScreen;

public class SearchTest extends BaseTest {

	SearchScreen searchScreen;

	@Test
	public void shouldFindOneExistingPipe() {

		String searchedPipeName = "IT Service Desk";

		searchScreen = dashboard.searchForExistingPipes(searchedPipeName);

		Assert.assertEquals(searchScreen.getFoundPipeName(), searchedPipeName);
		Assert.assertEquals(searchScreen.getSizeOfFoundPipe(), 1);
	}
}
