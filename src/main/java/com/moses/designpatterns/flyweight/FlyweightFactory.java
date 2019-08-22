package com.moses.designpatterns.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class FlyweightFactory {
    private static Map<String, Flyweight> flies = new ConcurrentHashMap<>();

    private static AtomicInteger count = new AtomicInteger();

    public static Flyweight factory(String state){
        Flyweight fly = flies.get(state);
        if(fly == null){
            synchronized (flies){
                fly = flies.get(state);
                if(fly == null) {
                    count.addAndGet(1);
                    fly = new ConcreteFlyweight(state);
                    flies.put(state, fly);
                }
            }
        }
        return fly;
    }

    public static int getCount(){
        return count.get();
    }
}
