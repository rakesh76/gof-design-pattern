package com.gof.design.pattern.creational.factory.pizza;

import org.junit.Test;

public class PizzaFactoryTest {

 @Test
    public void tetsPizza(){

     BasePizzaFactory basePizzaFactory = new PizzaFactory();
     Pizza veggie = basePizzaFactory.createPizza("veggie");
     Pizza cheese = basePizzaFactory.createPizza("Cheese");
  }
}
