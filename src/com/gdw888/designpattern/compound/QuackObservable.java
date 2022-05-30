package com.gdw888.designpattern.compound;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObserver();
}
