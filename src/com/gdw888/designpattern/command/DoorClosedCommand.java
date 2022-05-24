package com.gdw888.designpattern.command;

public class DoorClosedCommand implements RemoteContorllerCommand{
    private Door door;

    public DoorClosedCommand(Door door){
        this.door = door;
    }

    @Override
    public void execute() {
        this.door.setClosed();
    }

    @Override
    public void undo() {
        this.door.setOpened();
    }

    @Override
    public String getState() {
        return door.toString();
    }
}
