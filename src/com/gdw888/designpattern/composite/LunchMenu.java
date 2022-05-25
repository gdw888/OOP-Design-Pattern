package com.gdw888.designpattern.composite;

import java.util.Iterator;

public class LunchMenu extends MenuComposite{

    private MenuComposite[] menuItems;
    private static final int LUNCH_MENU_NUM = 3;

    public LunchMenu(){
        menuItems = new MenuComposite[LUNCH_MENU_NUM];

        menuItems[0] = new MenuItem("Pancake","Lunch Special", 2.00);
        menuItems[1] = new MenuItem("Coke","Pop", 1.00);
        menuItems[2] = new DessertMenu();
    }

    @Override
    protected Iterator<MenuComposite> getIterator() {
        return new MenuArrayIterator(menuItems);
    }
}
