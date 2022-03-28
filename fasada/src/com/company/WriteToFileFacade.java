package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFileFacade {

    public void writeToFile() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String fileName;
        boolean exit = false;
        String message;

        System.out.println("\nPodaj nazwę pliku (bez rozszerzenia):");
        fileName = keyboard.nextLine();

        TextFile textFile = new TextFile(fileName);
        String fullPath = textFile.getFullPath();

        FileWriter fileWriter = new FileWriter(fullPath);

        System.out.println("\nWprowadź dane do pliku." +
                "\nPo wciśnięciu `enter`, powstaje nowa linia." +
                "\nAby zakończyć, użyj komendy`/exit`.\n");

        do{
            try {
                message = keyboard.nextLine();

                if (message.equals("/exit")) exit = true;
                else fileWriter.write(message + "\n");

            }
            catch (IOException e){
                System.out.println("\nZła wartość, wprowadź nową:");
            }
        } while (!exit);
        fileWriter.close();

        System.out.println("\nZapisano (lub nadpisano) plik.");
        System.out.println("Nazwa: " + textFile.getName() + ".txt");
        System.out.println("Lokalizacja: " + textFile.getFullPath());
    }
}
