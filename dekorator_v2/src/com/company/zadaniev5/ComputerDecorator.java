package com.company.zadaniev5;

public abstract class ComputerDecorator implements Computer{

    protected Computer tempComputer;

    public ComputerDecorator(Computer newComputer){
        tempComputer = newComputer;
    }

    public String getDescription(){
        return tempComputer.getDescription();
    }

    public double getCost(){
        return tempComputer.getCost();
    }

}
