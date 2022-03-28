package com.company.zadaniev5;

public class EmptyComputer implements Computer{
    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public double getCost() {
        return 0;
    }
}
