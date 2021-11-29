package com.gdw888.designpattern.chainofresponsibility;

public class Main {
	public static void main(String args[]) {
		Database databse = new Database();

		Handler authHanlder = new UserExistHandler(databse);
								//.setNextHandler(new ValidPasswordHandler(databse));
		
		AuthService auth = new AuthService(authHanlder);
		auth.login("admin", "admin");
		
	}
}
