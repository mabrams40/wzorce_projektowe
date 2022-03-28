package com.company.zadaniev5;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class ComputerShop {
    public static void main(String[] args) throws InterruptedException {
        boolean buying; // Czy klient zamierza zakupić część
        boolean doNext; // Czy klient zrobi kolejny zakup
        String answer;
        int PurchaseNr = 1;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("© Maciej Abramski 3P, 08.01.2021.\n");
        System.out.println("SKLEP KOMPUTEROWY");
        System.out.println("Możesz zakupić kompletny komputer,");
        System.out.println("lub tylko niektóre części.");

        // Stworzenie listy na komputery
        ArrayList<Computer> computers = new ArrayList<>();

        do {

            // Konstruktor komputera
            Computer pc1 = new EmptyComputer();

            // Płyta główna
            buying = decorate(pc1, "Płyta główna");
            if (buying) pc1 = new Motherboard(pc1);

            // Procesor
            buying = decorate(pc1, "Procesor");
            if (buying) pc1 = new Cpu(pc1);

            // Karta graficzna
            buying = decorate(pc1, "Karta graficzna");
            if (buying) pc1 = new Gpu(pc1);

            // Pamięć RAM
            buying = decorate(pc1, "Pamięć RAM");
            if (buying) pc1 = new Ram(pc1);

            // Dysk HDD
            buying = decorate(pc1, "Dysk HDD");
            if (buying) pc1 = new HardDrive(pc1);

            // Zasilacz
            buying = decorate(pc1, "Zasilacz");
            if (buying) pc1 = new PowerSupply(pc1);

            // Obudowa
            buying = decorate(pc1, "Obudowa");
            if (buying) pc1 = new PcCase(pc1);

            // Wyświetlenie danych
            System.out.println("\nKupujesz: " + pc1.getDescription());
            System.out.printf("Cena: %.2f zł\n", pc1.getCost());

            // Płatność
            doPayment();

            // Dodanie komputera do listy
            computers.add(pc1);

            // Kolejny zakup
            int nextPurchaseNr = PurchaseNr + 1;
            System.out.println("\nCzy chcesz wykonać zakup nr. " + nextPurchaseNr + "?");
            System.out.println("W takim wypadku napisz: tak");
            answer = keyboard.nextLine();
            switch(answer){
                case "tak":
                    doNext = true;

                    // Numer zakupu
                    PurchaseNr++;
                    System.out.println("\nZakup nr. " + PurchaseNr);
                    break;
                default:
                    doNext = false;
                    break;
            }
        } while (doNext);

        // Wyświetlenie komputerów
        int answerInt;
        System.out.println("\nCzy chcesz wyświetlić wszystkie komputery?");
        System.out.println("(również nieopłacone) - nie zdążyliśmy ich rozmontować");
        System.out.println("W takim wypadku wprowadź: 1");
        System.out.println("Jeżeli chcesz wyjść ze sklepu wprowadź: 0");

        answerInt = keyboard.nextInt();
        switch(answerInt){
            case 1:
                System.out.println("\nLista komputerów:");
                int pcNr = 1;
                for(Computer i : computers){
                    System.out.println("\nKomputer nr. " + pcNr);
                    System.out.println("Opis: " +i.getDescription());
                    System.out.println("Cena: " + i.getCost() + " zł");
                    pcNr++;
                }
                break;
            case 0:
            default:
                System.out.println("\nZapraszamy ponownie!");
                break;
        }

    }

    public static boolean decorate(Computer pc, String part){
        Scanner keyboard = new Scanner(System.in);
        String answer;

        System.out.println("\nCzy chcesz kupić " + part + "?");
        System.out.println("Jeśli chcesz, napisz: tak");

        answer = keyboard.nextLine();
        if(answer.equals("tak"))
            return true;
        else
            return false;
    }

    public static void doPayment() throws InterruptedException {
        Scanner keyboard = new Scanner(System.in);
        String answer; // Potwierdzenie płatności

        System.out.println("Potwierdź zakup. Napisz: kupuję");
        answer = keyboard.nextLine();

        sleep(500);
        switch(answer){
            case "kupuję":
                System.out.println("\nCzekaj...");
                sleep(5000);
                System.out.println("Zakup opłacony.");
                break;
            default:
                System.out.println("\nCzekaj...");
                sleep(5000);
                System.out.println("Transakcja nieudana.");
                break;
        }
    }
}
