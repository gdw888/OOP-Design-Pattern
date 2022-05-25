package com.gdw888.designpattern.state;

public interface UberDriverState {
    public void receiveOrder();
    public void pickUpOrder();
    public void deliverOrder();
    public void finishOrder();
}
