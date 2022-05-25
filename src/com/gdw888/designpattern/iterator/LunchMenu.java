package com.gdw888.designpattern.iterator;

import java.util.Iterator;

public class LunchMenu implements Menu{

    private MenuItem[] menuItems;
    private static final int LUNCH_MENU_NUM = 2;

    public LunchMenu(){
        menuItems = new MenuItem[LUNCH_MENU_NUM];

        menuItems[0] = new MenuItem("Pancake","Lunch Special", 2.00);
        menuItems[1] = new MenuItem("Coke","Pop", 1.00);
    }
    @Override
    public Iterator<MenuItem> getIterator() {
        return new MenuArrayIterator(menuItems);
    }
}
