package com.company.zadaniev2;

public class Case extends ComponentDecorator{

    public Case(Component component) {
        super(component);
    }

    public int Case(){
       return 22;
    }

    @Override
    public double Cost() {
        return 333;
    }

    @Override
    public String Name() {
        return "Super Case";
    }
}
