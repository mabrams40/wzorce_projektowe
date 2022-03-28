package com.company.zadaniev5;

import static java.lang.Thread.sleep;

public class PcCase extends ComputerDecorator{
    public PcCase(Computer newComputer) throws InterruptedException {
        super(newComputer);

        System.out.println("Dodaję obudowę..");
        sleep(2000);
    }

    public String getDescription(){
        return tempComputer.getDescription() + ", Obudowa";
    }

    public double getCost(){
        return tempComputer.getCost() + 200.00;
    }
}
