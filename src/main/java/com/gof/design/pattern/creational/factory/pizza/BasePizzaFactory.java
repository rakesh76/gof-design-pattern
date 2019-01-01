package com.gof.design.pattern.creational.factory.pizza;

public interface BasePizzaFactory {

    public abstract Pizza createPizza(String pizzaType);
}
