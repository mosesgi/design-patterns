package com.moses.designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK Proxy API usage, 动态代理. 代理模式
 */
public class YellowCow implements InvocationHandler {
    private Person person;      //被代理对象

    public Object getInstance(Person person) throws Exception{
        this.person = person;
        Class clazz = person.getClass();
        System.out.println("被代理对象的class是: " + clazz);
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("I'm YellowCow, I will buy ticket for you..");
        System.out.println("------------------------------------------");

        method.invoke(person, args);

        System.out.println("------------------------------------------");
        System.out.println("买到了.");

        return null;
    }
}
