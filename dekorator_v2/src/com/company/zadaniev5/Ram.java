package com.company.zadaniev5;

import static java.lang.Thread.sleep;

public class Ram extends ComputerDecorator{
    public Ram(Computer newComputer) throws InterruptedException {
        super(newComputer);

        System.out.println("Dodaję pamięć RAM..");
        sleep(2000);
    }

    public String getDescription(){
        return tempComputer.getDescription() + ", Pamięć RAM";
    }

    public double getCost(){
        return tempComputer.getCost() + 380.00;
    }
}
