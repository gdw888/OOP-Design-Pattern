package com.gdw888.designpattern.chainofresponsibility;

public class ValidPasswordHandler extends Handler{
	private Database database;

	public ValidPasswordHandler(Database database){
		this.database = database;
	}

	@Override
	public boolean handle(String username, String password) {
		if (!database.isValidUser(username)){
			return false;
		}
		return handleNext(username, password);
	} 
}
