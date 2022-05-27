package com.gdw888.designpattern.proxy.virtual;

public class Main {

    public static void main(String args[]) throws InterruptedException {
        VirtualObject virtualObject = new VirtualObject();
        virtualObject.printArray();
        Thread.sleep(1000);
        virtualObject.printArray();
    }
}
