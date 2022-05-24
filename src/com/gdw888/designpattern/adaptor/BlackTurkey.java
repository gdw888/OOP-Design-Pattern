package com.gdw888.designpattern.adaptor;

public class BlackTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("BlackTurkey GOBBLE!");
    }
}
