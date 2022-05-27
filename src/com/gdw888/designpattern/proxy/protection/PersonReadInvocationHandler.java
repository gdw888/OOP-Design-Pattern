package com.gdw888.designpattern.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PersonReadInvocationHandler implements InvocationHandler {
    private Person person;

    public PersonReadInvocationHandler(Person person){
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException, InvocationTargetException {
        System.out.println(method.getName());

        if( method.getName().startsWith("set")){
            throw new IllegalAccessException("No privilege to update a person object");
        }

        return method.invoke(person,args);
    }
}
