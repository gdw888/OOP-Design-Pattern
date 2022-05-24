package com.gdw888.designpattern.facade;

// Facade class
public class HomeTheather {
    private Light light;
    private TV tv;

    public HomeTheather(Light light, TV tv){
        this.light = light;
        this.tv = tv;
    }

    public void watchMovie(){
        this.light.onButton();
        this.tv.onButton();
        System.out.println("Movie is starting now");
    }

    public void endMovie(){
        this.light.offButton();
        this.tv.offButton();
        System.out.println("Movie is terminating now");
    }
}
