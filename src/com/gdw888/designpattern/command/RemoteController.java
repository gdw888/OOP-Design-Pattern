package com.gdw888.designpattern.command;

public class RemoteController {
    private RemoteContorllerCommand[][] commands;
    private RemoteContorllerCommand undoCommand;
    private RemoteContorllerCommand noCommand;

    private final int COMMAND_NUM = 6;

    private final int COMMAND_ON_OFF_NUM = 2;
    private final int COMMAND_ON = 0;
    private final int COMMAND_OFF = 1;

    private int curCommandNum;

    public RemoteController(){
        curCommandNum = 0;
        initCommands();
    }

    private void initCommands(){
        noCommand = new NoCommand();
        commands = new RemoteContorllerCommand[COMMAND_NUM][COMMAND_ON_OFF_NUM];

        for (int i = 0; i < COMMAND_NUM; i++){
            for (int j = 0; j < COMMAND_ON_OFF_NUM; j++){
                commands[i][j] = noCommand;
            }
        }
    }

    public void addCommand(RemoteContorllerCommand on, RemoteContorllerCommand off){
        if (curCommandNum >= COMMAND_NUM){
            throw new RuntimeException("Cannot add more command");
        }

        commands[curCommandNum][COMMAND_ON] = on;
        commands[curCommandNum][COMMAND_OFF] = off;

        curCommandNum++;
    }

    public void onButtonWasPushed(int slot){
        commands[slot][COMMAND_ON].execute();
        undoCommand = commands[slot][COMMAND_ON];
    }

    public void offButtonWasPushed(int slot){
        commands[slot][COMMAND_OFF].execute();
        undoCommand = commands[slot][COMMAND_OFF];
    }

    public void onButtonWasPushed(){
        for (int index = 0; index < curCommandNum; index++)
            commands[index][COMMAND_ON].execute();
        undoCommand = noCommand;
    }

    public void offButtonWasPushed(){
        for (int index = 0; index < curCommandNum; index++)
            commands[index][COMMAND_OFF].execute();
        undoCommand = noCommand;
    }

    public void undo(){
        undoCommand.undo();
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < curCommandNum; index++){
            stringBuilder.append("SLOT["+index+"]: ");
            stringBuilder.append(commands[index][0].getState());
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
