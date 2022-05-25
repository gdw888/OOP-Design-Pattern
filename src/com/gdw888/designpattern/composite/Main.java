package com.gdw888.designpattern.composite;

import java.util.Iterator;

public class Main {

    public static void main(String args[]){
        DinnerMenu dinnerMenu = new DinnerMenu();
        LunchMenu lunchMenu = new LunchMenu();
        printMenu(dinnerMenu);
        printMenu(lunchMenu);

    }
    private static void printMenu(MenuComposite menu){

        Iterator<MenuComposite> iterator= menu.getIterator();
        while(iterator.hasNext()){
            MenuComposite menuitem = iterator.next();
            if (menuitem.getIterator() != null) {
                printMenu(menuitem);
            }else {
                System.out.println(menuitem);
            }
        }
    }
}
