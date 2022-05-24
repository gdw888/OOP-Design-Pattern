package com.gdw888.designpattern.template;

public class Application {
    public static void main(String args[]){
        Americano americano = new Americano();
        americano.makeCoffee();
        
        System.out.println();

        Espresso espresso = new Espresso();
        espresso.makeCoffee();
    }
}
