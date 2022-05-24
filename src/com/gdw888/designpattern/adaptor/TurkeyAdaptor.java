package com.gdw888.designpattern.adaptor;

public class TurkeyAdaptor implements Duck{
    private Turkey turkey;

    public TurkeyAdaptor(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        this.turkey.gobble();
    }
}
