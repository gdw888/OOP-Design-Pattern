package com.gdw888.designpattern.template;

public class Americano extends CoffeeMaker{

    @Override
    protected void addCondiments() {
        System.out.println("Americano: Adding condiments..");
    }
}
