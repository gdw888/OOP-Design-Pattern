package com.gdw888.designpattern.iterator;

import java.util.Iterator;

public class Main {
    public static void main(String args[]){
        Menu dinnerMenu = new DinnerMenu();
        Menu lunchMenu = new LunchMenu();

        printMenu(dinnerMenu);
        printMenu(lunchMenu);
    }

    private static void printMenu(Menu menu){
        Iterator<MenuItem> iterator= menu.getIterator();
        while(iterator.hasNext()){
            MenuItem menuitem = iterator.next();
            System.out.println(menuitem);
        }
    }
}
