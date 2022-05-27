package com.gdw888.designpattern.proxy.protection;

import java.lang.reflect.Proxy;

public class PersonImpl implements Person {
    private String name;
    private String sNum;

    private PersonImpl(){
        this.name = "Terry";
        this.sNum = "123";
    }

    public static Person getWriteInstance(){
        return new PersonImpl();
    }

    public static Person getReadInstance() {
        Person person = new PersonImpl();
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new PersonReadInvocationHandler(person));
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getsNum() {
        return this.sNum;
    }

    @Override
    public void setsNum(String sNumber) {
        this.sNum = sNumber;
    }
}
