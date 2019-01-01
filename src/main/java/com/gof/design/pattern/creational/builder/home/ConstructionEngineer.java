package com.gof.design.pattern.creational.builder.home;

public class ConstructionEngineer {

    private HouseBuilder builder;

    public ConstructionEngineer(HouseBuilder houseBuilder) {
        this.builder = houseBuilder;
    }

    public House buildHouse(){
        this.builder.buildFoundation();
        this.builder.buildStracture();
        this.builder.buildRoof();
        this.builder.paintHouse();
        this.builder.furnishHouse();
        return builder.getHouse();
    }
}
