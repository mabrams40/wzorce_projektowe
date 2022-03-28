package com.company.zadaniev5;

import static java.lang.Thread.sleep;

public class Cpu extends ComputerDecorator{
    public Cpu(Computer newComputer) throws InterruptedException {
        super(newComputer);

        System.out.println("Dodaję procesor..");
        sleep(2000);
    }

    public String getDescription(){
        return tempComputer.getDescription() + ", Procesor";
    }

    public double getCost(){
        return tempComputer.getCost() + 1100.00;
    }
}
