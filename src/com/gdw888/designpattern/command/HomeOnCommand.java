package com.gdw888.designpattern.command;

public class HomeOnCommand implements RemoteContorllerCommand{
    private Door door;
    private Light light;

    public HomeOnCommand(Light light, Door door){
        this.door = door;
        this.light = light;
    }

    @Override
    public void execute() {
        this.door.setOpened();
        this.light.setOn();
    }

    @Override
    public void undo() {
        this.door.setClosed();
        this.light.setOff();
    }

    @Override
    public String getState() {
        return door.toString() + " " + light.toString();
    }
}
