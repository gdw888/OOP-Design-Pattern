package com.gdw888.designpattern.command;

public class LightOnCommand implements RemoteContorllerCommand{
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.setOn();
    }

    @Override
    public void undo() {
        light.setOff();
    }

    @Override
    public String getState() {
        return light.toString();
    }
}
