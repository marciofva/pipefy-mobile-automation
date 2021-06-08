package com.pipefy.fixtures;

import java.util.HashMap;

public class LoginCredentials {

	public static HashMap<String, String> pipefyUser() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("user", "test@test.com");
		map.put("password", "3445hg@D");
		return map;
	}
}
