package com.gdw888.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observerList;
    private int data;

    public WeatherData(){
        data = 0;
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if(!observerList.contains(observer)) {
            observerList.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList){
            observer.update(data);
        }
    }

    public void setData(int num){
        this.data = num;
        notifyObserver();
    }
}
