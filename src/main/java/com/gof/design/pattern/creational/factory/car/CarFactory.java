package com.gof.design.pattern.creational.factory.car;

public class CarFactory {

	
	public static Car buildCar(CarType model){
		Car car = null;
	
		switch (model){
		  case SMALL:
			  car = new SmallCar();
			  break;
		  case SEDAN:
			  car = new SedanCar();
			  break;	  
			  
		  case LUXARY:
			  car = new LuxaryCar();
			  break;
		}
		
		return car;
	}
}
