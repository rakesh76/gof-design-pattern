package com.gof.design.pattern.creational.builder.home;

//it's an interface to build part of the product
public interface HouseBuilder {

    void buildFoundation();
    void buildStracture();
    void buildRoof();
    void paintHouse();
    void furnishHouse();
    House getHouse();

}
