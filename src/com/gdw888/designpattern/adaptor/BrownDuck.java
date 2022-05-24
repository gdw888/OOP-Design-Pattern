package com.gdw888.designpattern.adaptor;

public class BrownDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("BrownDuck: quack");
    }
}
