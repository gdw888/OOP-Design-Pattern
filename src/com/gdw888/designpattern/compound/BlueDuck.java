package com.gdw888.designpattern.compound;

import java.util.List;

public class BlueDuck implements Quack {

    private DuckObserver duckObserver;

    public BlueDuck(){
        duckObserver = new DuckObserver(this);
    }

    @Override
    public void quack() {
        System.out.println("Blue Duck: blue blue");
        notifyObserver();
    }

    @Override
    public String getName() {
        return "Blue Duck";
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
