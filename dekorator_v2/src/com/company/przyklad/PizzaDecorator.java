package com.company.przyklad;

public class PizzaDecorator extends Pizza{
    protected Pizza _pizza;

    public PizzaDecorator(Pizza pizza){
        _pizza = pizza;
    }

    @Override
    public double Cost() {
        return _pizza.Cost();
    }

    @Override
    public String Name() {
        return _pizza.Name();
    }
}
