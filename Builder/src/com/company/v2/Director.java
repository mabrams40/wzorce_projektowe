package com.company.v2;

/**
 * Klasa Kierownik definiuje kolejność w jakiej należy wywołać
 * etapy konstrukcyjne, aby móc stworzyć i następnie użyć
 * ponownie określone konfiguracje produktów.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder){
        this.builder = builder;
    }

    public void makeHouse(int type){
        builder.reset();

        switch(type){
            case 1: //zwykły dom
                builder.setDescription("Zwykly dom");
                builder.showName();

                builder.setWalls(4);
                builder.setDoors(1);
                builder.setWindows(2);
                builder.setRoof(Roof.DWUSPADOWY);
                builder.setPrice(300000.00);
                builder.setArea(150);
                break;
            case 2: //dom z basenem
                builder.setDescription("Dom z basenem");
                builder.showName();

                builder.setWalls(8);
                builder.setDoors(3);
                builder.setWindows(10);
                builder.setRoof(Roof.PULPITOWY);
                builder.setPrice(1000000.00);
                builder.setArea(300);
                builder.setPoolArea(25);
                break;
            case 3: //dom z garażem
                builder.setDescription("Dom z garażem");
                builder.showName();

                builder.setWalls(5);
                builder.setDoors(2);
                builder.setRoof(Roof.MANSARDOWY);
                builder.setPrice(500000.00);
                builder.setArea(200);
                builder.setGarageArea(35);
                break;
            case 4: // dom z ogrodem
                builder.setDescription("Dom z ogrodem");
                builder.showName();

                builder.setWalls(5);
                builder.setDoors(2);
                builder.setRoof(Roof.PLASKI);
                builder.setPrice(400000.00);
                builder.setArea(200);
                builder.setGardenArea(50);
                break;
            case 5: //dom ze wszystkim
                builder.setDescription("Dom z ogrodem, garażem i basenem");
                builder.showName();

                builder.setWalls(10);
                builder.setDoors(5);
                builder.setRoof(Roof.CZTEROSPADOWY);
                builder.setPrice(5000000.00);
                builder.setArea(350);
                builder.setGardenArea(70);
                builder.setGarageArea(50);
                builder.setPoolArea(30);

                break;
            default:
                System.out.println("Zła liczba!");
                break;
        }

        System.out.println(builder.getInfo());

    }
}
