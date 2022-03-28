package com.company.zadaniev3;

public class PowerSupply implements Component{
    @Override
    public double Cost() {
        return 101;
    }

    @Override
    public String Name() {
        return "nazwa_podzespolu";
    }
}
