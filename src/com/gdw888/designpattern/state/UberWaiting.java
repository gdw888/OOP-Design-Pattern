package com.gdw888.designpattern.state;

public class UberWaiting implements UberDriverState{
    private Uber uber;

    public UberWaiting(Uber uber){
        this.uber = uber;
    }

    @Override
    public void receiveOrder() {
        System.out.println("Picking up the order - Transitioning to the pickup state");
        uber.setState(uber.getUberDriverPickup());
    }

    @Override
    public void pickUpOrder() {

    }

    @Override
    public void deliverOrder() {

    }

    @Override
    public void finishOrder() {

    }
}
