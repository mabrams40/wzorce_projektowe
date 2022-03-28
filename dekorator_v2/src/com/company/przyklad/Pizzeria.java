package com.company.przyklad;

import javax.swing.JOptionPane;

public class Pizzeria {
    public static void main(String[] args) {
        Pizza smallPizza = new Small();
        smallPizza = new Ananas(smallPizza);
        smallPizza = new Ham(smallPizza);
        smallPizza = new Cheese(smallPizza);

        double cena = smallPizza.Cost();
        String nazwa = smallPizza.Name();

        JOptionPane.showMessageDialog(null,
                String.format("Rozmiar pizzy i dodatki:\n%s\nCena: %.2fzł", nazwa, cena)
                );
        System.out.printf("Rozmiar pizzy i dodatki:\n\t%s\nCena: %.2fzł", nazwa, cena);
    }
}
