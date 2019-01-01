package com.gof.design.pattern.creational.factory.car;

public class TestFactoryPattern {

	public static void main(String[] args) {
		
		System.out.println(CarFactory.buildCar(CarType.SEDAN));
		System.out.println(CarFactory.buildCar(CarType.LUXARY));
		System.out.println(CarFactory.buildCar(CarType.SMALL));
	}

}