package com.gdw888.designpattern.decorator;

public class Whip extends CondimentDecorator{

    public Whip(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.50;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+ " + Whip (0.50)";
    }
}
