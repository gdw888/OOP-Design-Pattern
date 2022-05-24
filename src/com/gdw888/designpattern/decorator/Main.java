package com.gdw888.designpattern.decorator;

public class Main {
    public static void main(String args[]){
        Coffee americano = new Americano();
        Coffee espresso = new Espresso();

        americano = new Sugar(americano);
        americano = new Whip(americano);

        espresso = new Sugar(espresso);

        System.out.println(americano.getDescription() + ": $" + americano.cost());
        System.out.println(espresso.getDescription() + ": $" + espresso.cost());
    }
}
