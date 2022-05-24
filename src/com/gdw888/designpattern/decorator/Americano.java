package com.gdw888.designpattern.decorator;

public class Americano extends Coffee{
    public Americano(){
        setDescription("Americano (1.00)");
    }
    @Override
    public double cost() {
        return 1.00;
    }
}
