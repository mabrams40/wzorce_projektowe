package com.company.zadaniev4;

import java.util.Scanner;

/**
 * Wzorowałem się na diagramie UML:
 * https://upload.wikimedia.org/wikipedia/commons
 * /e/e9/Decorator_UML_class_diagram.svg.
 *
 * Główna klasa wykonująca.
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Witamy w naszym sklepie komputerowym.");
        System.out.println("Podaj nazwy podzespołów, które chcesz zakupić.");

        //Tworzenie komputerów
        Computer pc1 = new Computer();

        System.out.println("\nPłyta główna:");
        pc1.motherboard.setName(keyboard.nextLine());
        System.out.println(pc1.motherboard.cost() + " zł");

        System.out.println("\nProcesor:");
        pc1.motherboard.setName(keyboard.nextLine());
        System.out.println(pc1.cpu.cost() + " zł");

    }
}
