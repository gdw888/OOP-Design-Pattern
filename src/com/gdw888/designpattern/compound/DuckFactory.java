package com.gdw888.designpattern.compound;

public class DuckFactory implements AbstractDuckFactory{
    @Override
    public Quack createRedDuck() {
        return new RedDuck();
    }

    @Override
    public Quack createBlueDuck() {
        return new BlueDuck();
    }
}
