package com.gdw888.designpattern.command;

public class DoorOpenCommand implements RemoteContorllerCommand{
    private Door door;

    public DoorOpenCommand(Door door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.setOpened();
    }

    @Override
    public void undo() {
        door.setClosed();
    }

    @Override
    public String getState() {
        return door.toString();
    }
}
