package com.company.v2;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner keyboard = new Scanner(System.in);
        int answer = 0;
        boolean liczba = true;

        System.out.println("Zakup nieruchomości\n\n");

        do {
            System.out.println("Jaki dom chcesz zakupić?");
            System.out.println("1 - Zwykły");
            System.out.println("2 - Z basenem");
            System.out.println("3 - Z garażem");
            System.out.println("4 - z ogrodem");
            System.out.println("5 - Ze wszystkim");

            System.out.println("\nWybierz liczbę:");
            int n = keyboard.nextInt();

            Builder builder = new HouseBuilder();
            Director director = new Director(builder);

            director.makeHouse(n); // tworzenie domu
            House myHouse = builder.getResult(); //obiekt dom
            myHouse.toString(); //wypisanie info
            
                try {
                    System.out.println("\nWprowadź 1, aby wybrać inny dom.");
                    System.out.println("Wprowadź 2, aby zakupić ten dom");
                    System.out.println("Wprowadź 0, aby wyjść.");
                    answer = keyboard.nextInt();
                } catch (InputMismatchException e) {
                    liczba = false;
                    while(liczba == false){
                        System.out.println("Wprowadź liczbę:");
                        answer = keyboard.nextInt();
                        if(answer == 0) {
                            liczba = true;
                            break;
                        }
                    }
                }
            }while(answer == 1);
        if(answer == 2){
            buy();
        }

        System.out.println("\nDo zobaczenia!");
    }

    public static void buy() throws InterruptedException {
        sleep(500);
        System.out.println("\nKupuję dom...");
        sleep(2000);
        System.out.println("Dziękujemy za zakup.");
    }
}
