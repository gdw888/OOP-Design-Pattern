package com.gdw888.designpattern.compound;

public class RedDuck implements Quack {

    private DuckObserver duckObserver;

    public RedDuck(){
        duckObserver = new DuckObserver(this);
    }

    @Override
    public void quack() {
        System.out.println("Red Duck: red red!");
        notifyObserver();
    }

    @Override
    public String getName() {
        return "red duck";
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
