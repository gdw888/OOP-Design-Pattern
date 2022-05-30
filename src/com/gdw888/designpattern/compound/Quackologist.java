package com.gdw888.designpattern.compound;

public class Quackologist implements Observer{
    private String quackologistName;

    public Quackologist(String name){
        this.quackologistName = name;
    }

    @Override
    public void update(Quack duck) {
        System.out.println( quackologistName +" - notified:" + duck.getName());
    }
}
