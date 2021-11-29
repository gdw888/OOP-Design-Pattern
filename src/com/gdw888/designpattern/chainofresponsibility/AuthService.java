package com.gdw888.designpattern.chainofresponsibility;

public class AuthService {
	private Handler handler;
	
	public AuthService(Handler handler) {
		this.handler = handler;
	}
	
	public boolean login(String user, String password) {
		return handler.handle(user, password);
	}
}
