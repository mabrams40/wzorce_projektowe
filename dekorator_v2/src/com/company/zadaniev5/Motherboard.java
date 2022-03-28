package com.company.zadaniev5;

import static java.lang.Thread.sleep;

public class Motherboard extends ComputerDecorator{
    public Motherboard(Computer newComputer) throws InterruptedException {
        super(newComputer);

        System.out.println("Dodaję płytę główną..");
        sleep(2000);
    }

    public String getDescription(){
        return tempComputer.getDescription() + "Płyta główna";
    }

    public double getCost(){
        return tempComputer.getCost() + 500.00;
    }
}
