package com.gof.design.pattern.creational.prototype.shoes;

public class TestPrototypePattern {

	public static void main(String[] args) {
		Shoes factory = ShoesFactory.makeObject("Sports");
		factory.wear();
		
		factory = ShoesFactory.makeObject("Formal");
		factory.wear();
	}
}