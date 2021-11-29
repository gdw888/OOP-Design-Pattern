package com.gdw888.designpattern.chainofresponsibility;

import java.util.HashMap;
import java.util.Map;

public class Database {
	Map<String,String> users;
	
	public Database() {
		users = new HashMap<>();
		users.put("admin", "admin");
		users.put("user", "user");
	}
	
	public boolean isValidUser(String username) {
		return users.containsKey(username);
	}
	
	public boolean isValidPassword(String username, String password) {
		return users.get(username).equals(password);
	}
}
