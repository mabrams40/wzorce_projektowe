package com.company.zadanie;

import java.util.Random;

/**
 * Klasa abstrakcyjna zawierająca
 * metody dla obiektu PC, które
 * zostaną zaimplementowane.
 */
public abstract class Pc {
    public double Cost(){
        return Math.random() * 800 + 299; // od 300 do 800
    }
    public abstract String Name();
}