package com.company.zadaniev5;

import static java.lang.Thread.sleep;

public class Gpu extends ComputerDecorator{
    public Gpu(Computer newComputer) throws InterruptedException {
        super(newComputer);

        System.out.println("Dodaję kartę graficzną..");
        sleep(2000);
    }

    public String getDescription(){
        return tempComputer.getDescription() + ", Karta graficzna";
    }

    public double getCost(){
        return tempComputer.getCost() + 650.00;
    }
}
