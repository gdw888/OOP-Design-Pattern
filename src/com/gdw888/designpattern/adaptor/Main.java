package com.gdw888.designpattern.adaptor;

public class Main {
    public static void main(String args[]){
        Turkey turkey = new BlackTurkey();
        Duck duck = new TurkeyAdaptor(turkey);

        duck.quack();
    }
}
