package com.company.zadaniev4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cpu extends Component{
    private String name;

    @Override
    public String name() {
        return name;
    }

    @Override
    public double cost() {
        // Cena jest między 300 i 800 zł
        double cost_long = Math.random() * 800 + 299;
        BigDecimal bd = new BigDecimal(cost_long).setScale(2, RoundingMode.HALF_UP);
        double cost = bd.doubleValue();
        return cost;
    }

    public void setName(String name){
        this.name = name;
    }
}
