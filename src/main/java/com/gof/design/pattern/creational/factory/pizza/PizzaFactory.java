package com.gof.design.pattern.creational.factory.pizza;

public class PizzaFactory implements BasePizzaFactory {

    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza;

        switch(pizzaType.toLowerCase()){
            case "cheese":
                pizza   = new CheesePizza();
                break;
            case "veggie":
                pizza   = new VeggiPizza();
                break;
            case "pepproni":
                pizza   = new PepperoniPizza();
                break;
            default: throw new IllegalArgumentException("No such pizza.");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
