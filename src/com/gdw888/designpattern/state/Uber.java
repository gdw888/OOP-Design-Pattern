package com.gdw888.designpattern.state;

public class Uber {
    private UberDriverState uberDriverWait;
    private UberDriverState uberDriverPickup;
    private UberDriverState uberDriverDeliver;
    private UberDriverState uberDriverComplete;

    private UberDriverState currentState;

    public Uber(){
        uberDriverWait = new UberWaiting(this);
        uberDriverPickup = new UberPickup(this);
        uberDriverDeliver = new UberDelivering(this);
        uberDriverComplete = new UberComplete(this);

        setState(uberDriverWait);
    }

    public void receiveOrder(){
        currentState.receiveOrder();
    }

    public void pickUpOrder(){
        currentState.pickUpOrder();
    }

    public void deliverOrder(){
        currentState.deliverOrder();
    }

    public void finishOrder(){
        currentState.finishOrder();
    }

    public void setState(UberDriverState uberDriverWait){
        this.currentState = uberDriverWait;
    }

    public UberDriverState getUberDriverWait() {
        return uberDriverWait;
    }

    public void setUberDriverWait(UberDriverState uberDriverWait) {
        this.uberDriverWait = uberDriverWait;
    }

    public UberDriverState getUberDriverPickup() {
        return uberDriverPickup;
    }

    public void setUberDriverPickup(UberDriverState uberDriverPickup) {
        this.uberDriverPickup = uberDriverPickup;
    }

    public UberDriverState getUberDriverDeliver() {
        return uberDriverDeliver;
    }

    public void setUberDriverDeliver(UberDriverState uberDriverDeliver) {
        this.uberDriverDeliver = uberDriverDeliver;
    }

    public UberDriverState getUberDriverComplete() {
        return uberDriverComplete;
    }

    public void setUberDriverComplete(UberDriverState uberDriverComplete) {
        this.uberDriverComplete = uberDriverComplete;
    }
}
