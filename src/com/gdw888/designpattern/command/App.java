package com.gdw888.designpattern.command;

public class App {
    public static void main(String args[]){
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        Door door = new Door();
        DoorOpenCommand doorOpenCommand = new DoorOpenCommand(door);
        DoorClosedCommand doorClosedCommand = new DoorClosedCommand(door);

        HomeOnCommand homeOnCommand = new HomeOnCommand(light, door);
        HomeOffCommand homeOffCommand = new HomeOffCommand(light, door);

        RemoteController remoteController = new RemoteController();
        remoteController.addCommand(lightOnCommand, lightOffCommand);
        remoteController.addCommand(doorOpenCommand, doorClosedCommand);
        remoteController.addCommand(homeOnCommand, homeOffCommand);

        remoteController.offButtonWasPushed(0);
        System.out.println(remoteController);

        remoteController.onButtonWasPushed(0);
        System.out.println(remoteController);

        remoteController.offButtonWasPushed(2);
        System.out.println(remoteController);

        remoteController.onButtonWasPushed(2);
        System.out.println(remoteController);

        remoteController.undo();
        System.out.println(remoteController);
    }
}
