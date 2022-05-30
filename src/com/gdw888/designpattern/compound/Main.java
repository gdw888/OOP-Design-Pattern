package com.gdw888.designpattern.compound;

public class Main {
    public static void main(String args[]){
        run();
    }

    public static void run(){
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory duckCountFactory = new DuckCountFactory();

        DuckComposite duckComposite = new DuckComposite();

        duckComposite.add(duckFactory.createBlueDuck());
        duckComposite.add(duckFactory.createRedDuck());

        addObserver(duckComposite);
        simulate(duckComposite);
    }

    public static void addObserver(Quack duck){
        Observer observer1 = new Quackologist("Quackologist1");
        Observer observer2 = new Quackologist("Quackologist2");

        duck.registerObserver(observer1);
        duck.registerObserver(observer2);
    }

    public static void simulate(Quack duck){
        duck.quack();
    }
}
