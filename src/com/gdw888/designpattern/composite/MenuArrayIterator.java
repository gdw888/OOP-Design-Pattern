package com.gdw888.designpattern.composite;

import java.util.Iterator;

public class MenuArrayIterator implements Iterator<MenuComposite> {

    private MenuComposite[] menuItems;
    private int menuSize;
    private int index;

    public MenuArrayIterator(MenuComposite[] menuItems){
        this.index = 0;
        this.menuItems = menuItems;
        this.menuSize = menuItems.length;
    }

    @Override
    public boolean hasNext() {
        boolean hasNext = true;
        if (index >= menuSize || menuItems[index] == null){
            hasNext = false;
        }
        return hasNext;
    }

    @Override
    public MenuComposite next() {
        MenuComposite menuItem = menuItems[index];
        index++;
        return menuItem;
    }
}
