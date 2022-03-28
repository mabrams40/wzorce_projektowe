package com.company.zadaniev3;

import java.util.Scanner;

public class Shop {

    private static int i = 1;

    public static void main(String[] args) {
        System.out.println("Witamy w naszym sklepie komputerowym.");
        System.out.println("Zapewne zamierzasz stworzyć i zakupić nowy komputer.");
        System.out.println("Podaj nazwy podzespołów, które chcesz zakupić.");

        setName("Obudowa");
        setName("Zasilacz");
        setName("Płyta główna");
        setName("Karta graficzna");
        setName("Dysk");
        setName("Pamięć RAM");


        //Computer computer = new Computer();

    }
    private static void setName(String component ){
        Scanner keyboard = new Scanner(System.in);
        String name;

        System.out.printf("\n%d. %s\n", i, component);
        System.out.println("- podaj nazwę:");
        name = keyboard.nextLine();
        System.out.println(name);

        i++; // kolejny element
    }
}
