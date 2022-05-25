package com.gdw888.designpattern.state;

public class UberPickup implements UberDriverState{
    private Uber uber;

    public UberPickup(Uber uber){
        this.uber = uber;
    }

    @Override
    public void receiveOrder() {

    }

    @Override
    public void pickUpOrder() {
        System.out.println("Picking up the order - Transitioning to the delivering state");
        uber.setState(uber.getUberDriverDeliver());
    }

    @Override
    public void deliverOrder() {

    }

    @Override
    public void finishOrder() {

    }
}
