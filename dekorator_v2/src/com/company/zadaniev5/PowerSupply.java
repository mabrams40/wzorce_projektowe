package com.company.zadaniev5;

import static java.lang.Thread.sleep;

public class PowerSupply extends ComputerDecorator{
    public PowerSupply(Computer newComputer) throws InterruptedException {
        super(newComputer);

        System.out.println("Dodaję zasilacz..");
        sleep(2000);
    }

    public String getDescription(){
        return tempComputer.getDescription() + ", Zasilacz";
    }

    public double getCost(){
        return tempComputer.getCost() + 310.00;
    }
}
