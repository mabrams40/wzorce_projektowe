package com.company;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFileFacade {

    public void createFile(){
        Scanner keyboard = new Scanner(System.in);
        String fileName;

        System.out.println("\nPodaj nazwę pliku (bez rozszerzenia):");
        fileName = keyboard.nextLine();

        TextFile textFile = new TextFile(fileName);
        String fullPath = textFile.getFullPath();

        File file = new File(fullPath);

        try {
            if(file.createNewFile()){
                System.out.println("\nWytworzono plik.");
                System.out.println("Nazwa: " + textFile.getName());
                System.out.println("Lokalizacja: " + textFile.getFullPath()); //dokonczyc
            }
            else{
                System.out.println("\nTaki plik już istnieje.");
                System.out.println("Nazwa: " + textFile.getName() + ".txt");
                System.out.println("Lokalizacja: " + textFile.getFullPath()); //dokonczyc
                System.out.println("Nie podjęto działań.");
            }

        }
        catch (IOException e){
            System.out.println("\nBłąd wytwarzania pliku!");
            e.printStackTrace();
        }
    }
}
