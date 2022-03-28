package com.company.v1;

/**
 * Klasa implementuje Budowniczego.
 */
public class HouseWithPoolBuilder implements Builder{
    private HouseWithPool house;

    public HouseWithPoolBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        this.house = new HouseWithPool();
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

    public void setPoolArea(double area){
        this.house.poolArea = 100.00;
    }

    public HouseWithPool getProduct(){
        HouseWithPool product = this.house;
        this.reset();
        return product;
    }

}
