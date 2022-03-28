package com.company.v2;

/**
 * Interfejs Budowniczego deklaruje etapy konstrukcji
 * produktu wspólne dla wszystkich typów budowniczych.
 */
public interface Builder {

    void reset();
    void setWalls(int number);
    void setDoors(int number);
    void setWindows(int number);
    void setRoof(Roof roof);
    void setDescription(String description);
    void showName();
    void setPrice(double cost);
    void setArea(double area);
    void setPoolArea(double area);
    void setGarageArea(double area);
    void setGardenArea(double area);
    House getResult(); //typu house
    String getInfo(); //wypisanie info



}
