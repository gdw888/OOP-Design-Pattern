package com.gdw888.designpattern.state;

public class UberDelivering implements UberDriverState{
    private Uber uber;

    public UberDelivering(Uber uber){
        this.uber = uber;
    }

    @Override
    public void receiveOrder() {

    }

    @Override
    public void pickUpOrder() {

    }

    @Override
    public void deliverOrder() {
        System.out.println("Delivered the order - Transitioning to the complete state");
        uber.setState(uber.getUberDriverComplete());
    }

    @Override
    public void finishOrder() {

    }
}
