package com.gdw888.designpattern.singleton;

public class SingletonClass {
	
	private static volatile SingletonClass singletonClass;
	private String data;
	
	private SingletonClass(String data) {
		this.data = data;
	}

	public static SingletonClass getInstance(String data) {
		SingletonClass instance = singletonClass;
		
		if (instance == null) {
			synchronized(SingletonClass.class) {
				if (instance == null)
					instance = new SingletonClass(data);
			}
		}
		return instance;
	}
}
