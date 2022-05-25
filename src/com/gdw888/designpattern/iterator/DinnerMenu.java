package com.gdw888.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DinnerMenu implements Iterable<MenuItem>{
    private List<MenuItem> dinnerMenus;

    public DinnerMenu(){
        dinnerMenus = new ArrayList<>();
        dinnerMenus.add(new MenuItem("Lobster","Pricey Menu", 100.00));
        dinnerMenus.add(new MenuItem("Steak","Pricey steak Menu", 50.00));
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return dinnerMenus.iterator();
    }
}
