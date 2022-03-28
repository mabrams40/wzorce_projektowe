package com.company.zadanie;

public class PcDecorator extends Pc{
    protected Pc _pc;

    public PcDecorator(Pc pc) {
        _pc = pc;
    }

    public PcDecorator() {

    }

    @Override
    public double Cost() {
        return _pc.Cost();
    }

    @Override
    public String Name() {
        return _pc.Name();
    }
}
