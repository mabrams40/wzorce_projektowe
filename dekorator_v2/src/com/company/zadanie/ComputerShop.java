package com.company.zadanie;

import java.util.Scanner;

/**
 * Polecenie:
 * Na podstawie wzorca dekorator utwórz sklep komputerowy w ktorym uzytkownik będzie mogl stworzyc swojego Pc.
 * Program ma dekorowac komputer wszystkimi komponenetami.
 *
 * Główna klasa wykonująca program.
 */
public class ComputerShop {
    private static int i = 1;

    public static void main(String[] args) {
        System.out.println("Witamy w naszym sklepie komputerowym.");
        System.out.println("Zapewne zamierzasz stworzyć i zakupić nowy komputer.");
        System.out.println("Podaj nazwy podzespołów i ich ceny.");

        /*
        System.out.println("\n1. Obudowa");
        System.out.println("- podaj nazwę:");
        name = keyboard.nextLine();

        System.out.println("\n2. Zasilacz");
        System.out.println("- podaj nazwę:");
        name = keyboard.nextLine();

        System.out.println("\n3. Płyta główna");
        System.out.println("- podaj nazwę:");
        name = keyboard.nextLine();

        System.out.println("\n3. Płyta główna");
        System.out.println("- podaj nazwę:");
        name = keyboard.nextLine();
        */

        setName("Obudowa");
        setName("Zasilacz");
        setName("Płyta główna");
        setName("Karta graficzna");
        setName("Dysk");
        setName("Pamięć RAM");

    }

    private static void setName(String component){
        Scanner keyboard = new Scanner(System.in);
        String name;

        System.out.printf("\n%d. %s\n", i, component);
        System.out.println("- podaj nazwę:");
        name = keyboard.nextLine();



        PcDecorator pc = new PcDecorator();
        //pc.getName(name);

        //pc = new Case();


        i++;
    }
}
