package com.gdw888.designpattern.decorator;

public class Espresso extends Coffee{

    public Espresso(){
        setDescription("Espresso (2.00)");
    }

    @Override
    public double cost() {
        return 2.00;
    }
}
