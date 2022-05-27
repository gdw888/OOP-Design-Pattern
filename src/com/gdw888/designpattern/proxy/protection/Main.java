package com.gdw888.designpattern.proxy.protection;

public class Main {
    public static void main(String args[]){
        Person personWrite = PersonImpl.getWriteInstance();
        Person personRead = PersonImpl.getReadInstance();

        System.out.println("name: "+personRead.getName());
        System.out.println("snum: "+personRead.getsNum());

        personRead.setName("Curry");
    }
}
