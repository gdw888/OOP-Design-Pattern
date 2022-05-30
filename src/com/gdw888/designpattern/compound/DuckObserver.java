package com.gdw888.designpattern.compound;

import java.util.ArrayList;
import java.util.List;

public class DuckObserver implements QuackObservable{

    private List<Observer> observers;
    private Quack duck;

    public DuckObserver(Quack quack){
        observers = new ArrayList<>();
        this.duck = quack;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(duck);
        }
    }
}
