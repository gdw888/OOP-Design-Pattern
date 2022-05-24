package com.gdw888.designpattern.command;

public class Light {
    private boolean light;
    public Light(){
        light = false;
    }

    public void setOff(){
        light = false;
    }

    public void setOn(){
        light = true;
    }

    @Override
    public String toString(){
        if (light){
            return "On";
        }else {
            return "Off";
        }
    }
}
