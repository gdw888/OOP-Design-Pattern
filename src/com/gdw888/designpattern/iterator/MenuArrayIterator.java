package com.gdw888.designpattern.iterator;

import java.util.Iterator;

public class MenuArrayIterator implements Iterator<MenuItem> {

    private MenuItem[] menuItems;
    private int menuSize;
    private int index;

    public MenuArrayIterator(MenuItem[] menuItems){
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
    public MenuItem next() {
        MenuItem menuItem = menuItems[index];
        index++;
        return menuItem;
    }
}
