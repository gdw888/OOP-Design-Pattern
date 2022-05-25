package com.gdw888.designpattern.composite;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DessertMenu extends MenuComposite{
    Map<String, MenuComposite> menuItemMap;

    public DessertMenu() {
        menuItemMap = new HashMap<>();
        menuItemMap.put("Ice cream", new MenuItem("Ice cream","Ice cream", 3.00));
        menuItemMap.put("Coffee", new MenuItem("Coffee","Coffee", 2.00));
    }

    @Override
    protected Iterator<MenuComposite> getIterator() {
        return menuItemMap.values().iterator();
    }
}
