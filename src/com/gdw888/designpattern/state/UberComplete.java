package com.gdw888.designpattern.state;

public class UberComplete implements UberDriverState{
    private Uber uber;

    public UberComplete(Uber uber){
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

    }

    @Override
    public void finishOrder() {
        System.out.println("Finishing up the order - Transitioning to Wait state");
        uber.setState(uber.getUberDriverWait());
    }
}
