package com.gdw888.designpattern.template;

public class Espresso extends CoffeeMaker{
    @Override
    protected void addCondiments() {
        System.out.println("Espresso: Adding condiments..");
    }
}
