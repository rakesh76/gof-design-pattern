package com.gof.design.pattern.creational.factory.car;

public class LuxaryCar extends Car {
	
	public LuxaryCar(){
		super(CarType.LUXARY);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Constructing Luxary Car");
	}
}
