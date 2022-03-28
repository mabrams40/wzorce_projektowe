package com.company.zadaniev2;

public class ComponentDecorator extends Component{
    protected Component component;

    public ComponentDecorator(Component component){
        this.component = component;
    }

    @Override
    public double Cost() {
        return this.component.Cost();
    }

    @Override
    public String Name() {
        return this.component.Name();
    }
}
