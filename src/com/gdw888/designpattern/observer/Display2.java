package com.gdw888.designpattern.observer;

public class Display2 implements Observer{
    private Subject subject;

    public Display2(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    public void removeDisplay(){
        subject.removeObserver(this);
    }

    @Override
    public void update(int num) {
        System.out.println("Display2: " +num);
    }
}
