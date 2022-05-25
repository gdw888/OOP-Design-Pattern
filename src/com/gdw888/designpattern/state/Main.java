package com.gdw888.designpattern.state;

public class Main {
    public static void main(String args[]){
        Uber uber = new Uber();

        uber.receiveOrder();
        uber.pickUpOrder();
        uber.deliverOrder();
        uber.finishOrder();
    }
}
