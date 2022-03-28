package com.company.v1;

/**
 * Klasa director nadzoruje budowniczymi.
 * Wykonuje działania w określonej kolejności.
 */
public class Director {
    private Builder builder;

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public void changeBuilder(Builder builder){
        this.builder = builder;
    }

    public void constructBasicHouse(BasicHouseBuilder builder){
        builder.reset();
        builder.setHouseType(HouseType.HOUSE_BASIC);
        builder.setArea(300);
        builder.setWalls(4);
        builder.setWindows(2);
        builder.setPrice(350000.00);
    }

    public void constructHouseWithPool(HouseWithPoolBuilder builder){
        builder.reset();
        builder.setHouseType(HouseType.HOUSE_WITH_POOL);
        builder.setArea(600);
        builder.setWalls(8);
        builder.setWindows(10);
        builder.setPrice(2000000.00);

        builder.setPoolArea(200.00);
    }

}
