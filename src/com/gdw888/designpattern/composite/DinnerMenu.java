package com.gdw888.designpattern.composite;

import java.util.*;

public class DinnerMenu extends MenuComposite {
    private List<MenuComposite> dinnerMenus;

    public DinnerMenu(){
        dinnerMenus = new ArrayList<>();
        dinnerMenus.add(new MenuItem("Lobster","Pricey Menu", 100.00));
        dinnerMenus.add(new MenuItem("Steak","Pricey steak Menu", 50.00));
        dinnerMenus.add(new DessertMenu());
    }

    @Override
    protected Iterator<MenuComposite> getIterator() {
        return dinnerMenus.iterator();
    }
}
