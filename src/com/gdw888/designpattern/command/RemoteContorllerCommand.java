package com.gdw888.designpattern.command;

public interface RemoteContorllerCommand {
    public void execute();
    public void undo();
    public String getState();
}
