package com.moses.designpatterns.flyweight;

import java.util.concurrent.Executors;

public class FlyweightTest {

    public void singleThreadTest(){
        Flyweight fly = FlyweightFactory.factory("A");
        fly.operation("First call");

        fly = FlyweightFactory.factory("B");
        fly.operation("Second call");

        fly = FlyweightFactory.factory("A");
        fly.operation("Third call");
    }

    public void multiThreadTest(){
        FlyweightThread thread = new FlyweightThread();
        new Thread(thread).start();

        new Thread(thread).start();
    }

    public static void main(String[] args) {
        new FlyweightTest().multiThreadTest();
    }

    private class FlyweightThread implements Runnable{

        @Override
        public void run() {
            String currThread = Thread.currentThread().getName();
            Flyweight fly = FlyweightFactory.factory("A");
            fly.operation(currThread);

            fly = FlyweightFactory.factory("B");
            fly.operation(currThread);

            fly = FlyweightFactory.factory("C");
            fly.operation(currThread);

            System.out.println("Count:" + FlyweightFactory.getCount());
        }
    }
}
