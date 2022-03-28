package com.company;

import javax.swing.JFileChooser;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Thread.sleep;

/**
 * Program implementuje wzorzec projektowy: Fasada.
 * https://refactoring.guru/pl/design-patterns/facade/java/example
 *
 * Mój temat projektu: Tworzenie i edycja plików.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.out.println("\n=> Program tworzy pliki tekstowe," +
                "\n- jeżeli plik jest pusty, zapisuje dane," +
                "\n- jeżeli plik nie jest pusty, nadpisuje dane" +
                "\n=> Lokalizacja - folder Downloads");

        System.out.println("\n1 - Nowy plik tekstowy");
        System.out.println("2 - Edytuj plik tekstowy\n");

        checkOption();
    }

    public static void checkOption() throws InterruptedException, IOException {
        Scanner keyboard = new Scanner(System.in);
        int answer;

        System.out.println("Wybierz opcję:");
        answer = keyboard.nextInt();

        switch(answer){
            case 1: // tworzenie pliku
                CreateFileFacade facade = new CreateFileFacade();
                facade.createFile(); // zwraca plik
                break;
            case 2: // edycja pliku
                WriteToFileFacade facade2 = new WriteToFileFacade();
                facade2.writeToFile();
                break;
            default:
                System.out.println("Zła liczba.");
                return;
        }
    }
}
