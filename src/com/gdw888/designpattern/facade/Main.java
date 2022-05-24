package com.gdw888.designpattern.facade;

public class Main {
    public static void main(String args[]){
        HomeTheather homeTheather = new HomeTheather(new Light(), new TV());
        homeTheather.watchMovie();
        homeTheather.endMovie();
    }
}
