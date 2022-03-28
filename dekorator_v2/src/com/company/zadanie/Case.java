package com.company.zadanie;

public class Case extends PcDecorator{

    public Case(Pc pc){
        super(pc);
    }

    @Override
    public double Cost() {
        return super.Cost();
    }

    @Override
    public String Name() {
        return super.Name() + "Case: ";
    }
}
