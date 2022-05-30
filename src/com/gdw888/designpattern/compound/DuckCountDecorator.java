package com.gdw888.designpattern.compound;

public class DuckCountDecorator implements Quack{

    private Quack quack;
    private static int counter = 0;
    private DuckObserver duckObserver;

    public DuckCountDecorator(Quack quack){
        this.quack = quack;
        this.duckObserver = new DuckObserver(this);
    }

    @Override
    public void quack() {
        counter++;
        quack.quack();
    }

    @Override
    public String getName() {
        return quack.getName();
    }

    public static int getCounter(){
        return counter;
    }

    @Override
    public void registerObserver(Observer observer) {
        duckObserver.registerObserver(observer);
    }

    @Override
    public void notifyObserver() {
        duckObserver.notifyObserver();
    }
}
