package com.gdw888.designpattern.prototype;

public class Car extends Vehicle{
	private String brand;

	public Car(Car car) {
		super(car);
		this.brand = car.brand;
	}

	@Override
	public Vehicle clone() {
		return new Car(this);
	}
}
