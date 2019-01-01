package com.gof.design.pattern.creational.factory.pizza;

public class VeggiPizza extends Pizza {

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for Veggi pizza");
    }
}
