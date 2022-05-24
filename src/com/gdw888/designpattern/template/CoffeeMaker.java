package com.gdw888.designpattern.template;

public abstract class CoffeeMaker {

    public void makeCoffee(){
        prepareIngredient();
        addCondiments();
        decoratePlate();
    }

    private void prepareIngredient(){
        System.out.println("Preparing ingredients..");
    }

    private void decoratePlate(){
        System.out.println("Decorating Plate...");
    }

    protected abstract void addCondiments();
}
