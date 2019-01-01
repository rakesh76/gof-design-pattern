package com.gof.design.pattern.creational.prototype.shoes;

public class SportsShoes extends Shoes {
	
	private static final long serialVersionUID = 3519407528214359973L;
	
	public String toString(){
		return "SportShoes";
	}

	@Override
	void wear() {
		System.out.println("Wearing Sports Shoes");

	}

}