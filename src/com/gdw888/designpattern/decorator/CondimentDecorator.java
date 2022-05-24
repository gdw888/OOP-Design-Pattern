package com.gdw888.designpattern.decorator;

public abstract class CondimentDecorator extends Coffee{
    Coffee coffee;
    public abstract String getDescription();
}
