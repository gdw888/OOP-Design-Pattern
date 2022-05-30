package com.gdw888.designpattern.compound;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DuckComposite implements Quack{

    private List<Quack> quackList;

    public DuckComposite(){
        quackList = new ArrayList<>();
    }

    public void add(Quack quack){
        quackList.add(quack);
    }

    @Override
    public void quack() {
        Iterator<Quack> iterator = quackList.iterator();
        while(iterator.hasNext()){
            iterator.next().quack();
        }
    }

    @Override
    public String getName() {
        StringBuilder sb = new StringBuilder();
        Iterator<Quack> iterator = quackList.iterator();
        while(iterator.hasNext()){
            sb.append(iterator.next().getName() + " ");
        }
        return sb.toString();
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quack> iterator = quackList.iterator();
        while(iterator.hasNext()){
            iterator.next().registerObserver(observer);
        }
    }

    @Override
    public void notifyObserver() {
        Iterator<Quack> iterator = quackList.iterator();
        while(iterator.hasNext()){
            iterator.next().notifyObserver();
        }
    }
}
