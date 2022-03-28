package com.company.przyklad;

public class Ham extends PizzaDecorator{


    public Ham(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double Cost(){
        return super.Cost() + 3.50;
    }

    @Override
    public String Name() {
        return super.Name() + " Ham ";
    }
}
