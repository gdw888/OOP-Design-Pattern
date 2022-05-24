package com.gdw888.designpattern.decorator;

public abstract class Coffee {
    String description = "Coffee";

    public String getDescription(){
        return description;
    }

    protected void setDescription(String description){
        this.description = description;
    }

    public abstract double cost();
}
