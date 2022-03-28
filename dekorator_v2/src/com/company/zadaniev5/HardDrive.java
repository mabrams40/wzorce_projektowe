package com.company.zadaniev5;

import static java.lang.Thread.sleep;

public class HardDrive extends ComputerDecorator{
    public HardDrive(Computer newComputer) throws InterruptedException {
        super(newComputer);

        System.out.println("Dodaję dysk HDD..");
        sleep(2000);
    }

    public String getDescription(){
        return tempComputer.getDescription() + ", Dysk HDD";
    }

    public double getCost(){
        return tempComputer.getCost() + 380.00;
    }
}
