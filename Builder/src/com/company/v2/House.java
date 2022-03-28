package com.company.v2;

public class House {
    private int walls;
    private int doors;
    private int windows;
    private Roof roof;
    private double cost;
    private double poolArea;
    private double area;
    private String description;
    private double garageArea;
    private double gardenArea;

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void showName(){
        System.out.println(this.description);
    }

    public void setPoolArea(double area){ this.poolArea = area;}

    public void setArea(double area){ this.area = area;}

    public void setGarageArea(double area){ this.garageArea = area;}

    public void setGardenArea(double area){ this.gardenArea = area;}

    public void setPrice(double cost) {
        this.cost = cost;
    }

}
