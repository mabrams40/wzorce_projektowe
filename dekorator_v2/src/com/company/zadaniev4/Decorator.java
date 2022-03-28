package com.company.zadaniev4;

public class Decorator extends Component{

    protected Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    String name() {
        return component.name();
    }

    @Override
    double cost() {
        return component.cost();
    }
}
