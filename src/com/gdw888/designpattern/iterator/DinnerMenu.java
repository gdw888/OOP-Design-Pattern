package com.gdw888.designpattern.iterator;

import java.util.*;

public class DinnerMenu implements Iterable<MenuItem>{
    private Map<String,MenuItem> dinnerMenus;

    public DinnerMenu(){
        dinnerMenus = new HashMap();
        dinnerMenus.put("Lobster", new MenuItem("Lobster","Pricey Menu", 100.00));
        dinnerMenus.put("Steak", new MenuItem("Steak","Pricey steak Menu", 50.00));
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return dinnerMenus.values().iterator();
    }
}
