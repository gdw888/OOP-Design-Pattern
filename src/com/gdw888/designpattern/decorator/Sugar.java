package com.gdw888.designpattern.decorator;

public class Sugar extends CondimentDecorator{

    public Sugar(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return this.coffee.cost() + 0.25;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + " + Sugar (0.25)";
    }
}
