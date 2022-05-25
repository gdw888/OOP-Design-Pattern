package com.gdw888.designpattern.iterator;

import java.util.Iterator;

public class Main {

    public static void main(String args[]){
        DinnerMenu dinnerMenu = new DinnerMenu();
        LunchMenu lunchMenu = new LunchMenu();

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

    private static void printMenu(Iterable<MenuItem> menu){
        for(MenuItem menuItem: menu){
            System.out.println(menuItem);
        }

        Iterator<MenuItem> iterator= menu.iterator();
        while(iterator.hasNext()){
            MenuItem menuitem = iterator.next();
            System.out.println(menuitem);
        }
    }
}
