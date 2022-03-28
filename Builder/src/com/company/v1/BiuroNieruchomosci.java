package com.company.v1;


import java.util.Scanner;

/**
 * Stworzyć biuro nieruchomości.
 * Wykorzystać Builder.
 */
public class BiuroNieruchomosci {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String answerStr;
        int answerInt;

        System.out.println("Biuro nieruchomości");

        System.out.println("\nRodzaje domów:");
        System.out.println("1. Dom zwykły");
        System.out.println("2. Dom z basenem");
        System.out.println("3. Dom z garażem");
        System.out.println("4. Dom z ogrodem");
        System.out.println("9. Żaden");

        System.out.println("\nKtóry dom wybierasz?");

        answerStr = keyboard.nextLine();
        answerInt = Integer.parseInt(answerStr);


        switch (answerInt) {
            case 1:
                House basic = makeBasicHouse();
                System.out.printf("Nazwa: Zwykły Dom\n" +
                        "Powierzchnia: %,.2f m^2\n" +
                        "Sciany: %d\n" +
                        "Okna: %d\n" +
                        "Cena: %,.2f zł\n",
                        basic.area,
                        basic.walls, basic.windows, basic.price);
                break;
            case 2:
                HouseWithPool pool = makeHouseWithPool();
                System.out.printf("Nazwa: Dom z Basenem\n" +
                                "Powierzchnia: %,.2f m^2\n" +
                                "Sciany: %d\n" +
                                "Okna: %d\n" +
                                "Powierzchnia Basenu: %,.2f m^2\n" +
                                "Cena: %,.2f zł\n",
                        pool.area, pool.walls,
                        pool.windows, pool.poolArea, pool.price);

                break;
            case 3:
                break;
            case 4:
                break;
            case 9:
                break;
            default:
                System.out.println("Zła odpowiedź");
                break;
        }
    }

    public static House makeBasicHouse(){
        Director director = new Director();

        BasicHouseBuilder builder = new BasicHouseBuilder();
        director.constructBasicHouse(builder);
        House house = builder.getProduct();

        return house;
    }

    public static HouseWithPool makeHouseWithPool(){
        Director director = new Director();

        HouseWithPoolBuilder builder = new HouseWithPoolBuilder();
        director.constructHouseWithPool(builder);
        HouseWithPool house = builder.getProduct();

        return house;
    }
}
