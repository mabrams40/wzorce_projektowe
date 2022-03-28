package com.company.v1;

/**
 * Klasa implementuje Budowniczego.
 */
public class BasicHouseBuilder implements Builder{
    private House house;

    public BasicHouseBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        this.house = new House();
    }

    @Override
    public void setHouseType(HouseType type) {
        this.house.type = type;
    }

    @Override
    public void setArea(double area) {
        this.house.area = area;
    }

    @Override
    public void setWalls(int floors) {
        this.house.walls = floors;
    }

    @Override
    public void setWindows(int windows) {
        this.house.windows = windows;
    }

    @Override
    public void setPrice(double price) {
        this.house.price = price;
    }

    public House getProduct(){
        House product = this.house;
        this.reset();
        return product;
    }

}
