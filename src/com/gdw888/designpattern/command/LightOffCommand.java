package com.gdw888.designpattern.command;

public class LightOffCommand implements RemoteContorllerCommand{
    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.setOff();
    }

    @Override
    public void undo() {
        light.setOn();
    }

    @Override
    public String getState() {
        return light.toString();
    }
}
