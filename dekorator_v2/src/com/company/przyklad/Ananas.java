package com.company.przyklad;

public class Ananas extends PizzaDecorator{


    public Ananas(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double Cost(){
        return super.Cost() + 2.15;
    }

    @Override
    public String Name() {
        return super.Name() + " Ananas ";
    }
}
