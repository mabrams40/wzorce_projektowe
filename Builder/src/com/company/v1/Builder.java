package com.company.v1;

public interface Builder {
    void reset();
    void setHouseType(HouseType type);
    void setArea(double area);
    void setWalls(int floors);
    void setWindows(int windows);
    void setPrice(double price);
}
