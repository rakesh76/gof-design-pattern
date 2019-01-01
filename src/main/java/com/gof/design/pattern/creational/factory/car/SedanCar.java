package com.gof.design.pattern.creational.factory.car;

public class SedanCar extends Car {
	
	public SedanCar(){
		super(CarType.SEDAN);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Constructing Sedan Car");
	}
}
