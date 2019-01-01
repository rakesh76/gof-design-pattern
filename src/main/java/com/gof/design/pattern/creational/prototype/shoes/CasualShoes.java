package com.gof.design.pattern.creational.prototype.shoes;

public class CasualShoes extends Shoes {

	private static final long serialVersionUID = 3519407528214359973L;
	
	public String toString(){
		return "CasualShoes";
	}

	@Override
	void wear() {
		System.out.println("Wearing Casual Shoes");

	}

}