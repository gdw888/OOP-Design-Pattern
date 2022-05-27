package com.gdw888.designpattern.proxy.virtual;

public class VirtualObject {
    private int integerArray[];
    private volatile boolean initialized;
    private final int arrayNum = 1000;

    public VirtualObject(){
        integerArray = new int[arrayNum];
        initialized = false;
    }

    public synchronized void printArray(){
        System.out.println("init:" + initialized);
        if (initialized){
            for (int i = 0; i < arrayNum; i++){
                System.out.print(integerArray[i]+" ");
            }
            System.out.println();
        }else{
            for (int i = 0; i < arrayNum; i++){
                System.out.print(i+" ");
            }
            System.out.println();

            new Thread(()->{
                initArray();
            }).run();
        }
    }

    private synchronized void initArray(){
        for (int i = 0; i < arrayNum; i++){
            integerArray[i] = 100;
        }
        initialized = true;
    }
}
