package com.company.v2;

/**
 * Konkretni Budowniczowie zapewniają różne implementacje etapów konstrukcji. Konkretni
 * budowniczowie mogą tworzyć produkty które nie mają wspólnego interfejsu.
 */
public class HouseBuilder implements Builder{

    private House result;
    private String info;

    @Override
    public void reset() {
        this.result = new House();
        info = "";
    }

    @Override
    public void setWalls(int number) {
        result.setWalls(number);
        info += "\nWalls: " + number;
    }

    @Override
    public void setDoors(int number) {
        result.setDoors(number);
        info += "\nDoors: " + number;
    }

    @Override
    public void setWindows(int number) {
        result.setWindows(number);
        info += "\nWindows: " + number;
    }

    @Override
    public void setRoof(Roof roof) {
        result.setRoof(roof);
        info += "\nRoof: " + roof;
    }

    @Override
    public void showName() {
        result.showName();
    }

    @Override
    public void setDescription(String description) {
        result.setDescription(description);
    }

    @Override
    public void setPrice(double cost) {
        result.setPrice(cost);
        info += "\nPrice: " + cost + " zł";
    }

    @Override
    public void setArea(double area) {
        result.setArea(area);
        info += "\nHouse Area: " + area + " m^2";
    }

    public void setPoolArea(double area){
        result.setPoolArea(area);
        info += "\nPool area: " + area + " m^2";
    }

    @Override
    public void setGarageArea(double area) {
        result.setGarageArea(area);
        info += "\nGarage area: " + area + " m^2";
    }

    @Override
    public void setGardenArea(double area) {
        result.setGardenArea(area);
        info += "\nGarden area: " + area + " m^2";
    }

    @Override
    public House getResult() {
        return this.result;
    }

    @Override
    public String getInfo() {
        return info;
    }
}
