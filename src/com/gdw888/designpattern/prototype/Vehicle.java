package com.gdw888.designpattern.prototype;

public abstract class Vehicle {
	private String brand;
	
	public Vehicle(Vehicle vehicle) {
		this.brand = vehicle.brand;
	}
	
	public abstract Vehicle clone();
}
