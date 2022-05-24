package com.gdw888.designpattern.command;

public class Door {
    private boolean opened = false;

    public Door(){
        opened = false;
    }

    public void setOpened(){
        opened = true;
    }

    public void setClosed(){
        opened = false;
    }

    @Override
    public String toString(){
        if (opened){
            return "Open";
        }else {
            return "Close";
        }
    }
}
