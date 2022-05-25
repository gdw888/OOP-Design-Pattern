package com.gdw888.designpattern.composite;

import java.util.Iterator;

public abstract class MenuComposite {
    protected abstract Iterator<MenuComposite> getIterator();
}
