package com.company;

/**
 * Klasa zawiera podstawowe informacje o pliku tekstowym.
 */
public class TextFile {
    private String name;
    private String fullPath;
    private String windowsPath = System.getProperty("user.home"); // lokalizacja home
    private String extension = ".txt";

    public TextFile(String name){
        this.name = name;
        fullPath = windowsPath + "\\Downloads\\" + name + extension;
    }

    public String getFullPath() {
        return fullPath;
    }

    public String getName() {
        return name;
    }
}
