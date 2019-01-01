package com.gof.design.pattern.creational.builder.home;

import org.junit.Test;

public class ConstructionEngineerTest {


     @Test
     public void testConstructionHouse(){
          HouseBuilder houseBuilder = new ConcreteHouseBuilder();
          ConstructionEngineer constructionEngineer = new ConstructionEngineer(houseBuilder);
          House houseA = constructionEngineer.buildHouse();
          System.out.println("House is: "+houseA);

          HouseBuilder prefebricatedHouseBuilder = new PrefabricatedHouseBuilder();
          ConstructionEngineer constructionEngineer1 = new ConstructionEngineer(prefebricatedHouseBuilder);
          House houseB = constructionEngineer1.buildHouse();
          System.out.println("House is: "+houseB);

     }

}
