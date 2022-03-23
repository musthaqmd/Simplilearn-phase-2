package com.simplilearn;

import java.util.HashMap;

public class LoginDetails {
	private static LoginDetails loginDetails = new LoginDetails();
	private static HashMap<String, String> map;
	
	static {
		map = new HashMap<String, String>();
		map.put("amit12@gmail.com", "amit@12");
		map.put("amit13@gmail.com", "amit@13");
		map.put("amit14@gmail.com", "amit@14");
		map.put("amit15@gmail.com", "amit@15");
		map.put("amit16@gmail.com", "amit@16");
	}

	/**
	 * This class is single tone class so we declared private constructor
	 */
	private LoginDetails() { }
	
	public static LoginDetails getInstance() {
		return loginDetails;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public boolean isLoginCreadetialsCorrect(final String username, final String password) {
		boolean isLoginCreadetialsCorrect = false;
		boolean nullFlagUsername = (username != null && !username.isEmpty()) ? true : false;
		boolean nullFlagPassword = (password != null && !password.isEmpty()) ? true : false;

		if(nullFlagUsername && nullFlagPassword) {
			if(map.containsKey(username) ) {
				String mapValue = map.get(username);
				if(mapValue.equals(password)) {
					isLoginCreadetialsCorrect = true;
				}
			}
		}
		return isLoginCreadetialsCorrect;
	}

}
