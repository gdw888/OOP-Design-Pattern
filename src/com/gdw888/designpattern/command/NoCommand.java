package com.gdw888.designpattern.command;

public class NoCommand implements RemoteContorllerCommand{

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }

    @Override
    public String getState() {
        return "";
    }
}
