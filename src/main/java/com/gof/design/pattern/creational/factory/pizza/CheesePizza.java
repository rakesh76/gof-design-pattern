package com.gof.design.pattern.creational.factory.pizza;

public class CheesePizza extends Pizza {

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for Cheese pizza");
    }
}
