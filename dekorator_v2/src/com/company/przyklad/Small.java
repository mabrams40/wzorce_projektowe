package com.company.przyklad;

public class Small extends Pizza{
    public double Cost(){
        return 12;
    }

    @Override
    public String Name(){
        return "Small Pizza";
    }
}
