package com.gdw888.designpattern.compound;

public class DuckCountFactory implements AbstractDuckFactory{
    @Override
    public Quack createRedDuck() {
        return new DuckCountDecorator(new RedDuck());
    }

    @Override
    public Quack createBlueDuck() {
        return new DuckCountDecorator(new BlueDuck());
    }
}
