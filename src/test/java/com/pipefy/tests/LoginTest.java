package com.pipefy.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test
	public void shouldLoginSucessfuly() {
		Assert.assertTrue(dashboard.dashboardIsVisible());
	}
}
