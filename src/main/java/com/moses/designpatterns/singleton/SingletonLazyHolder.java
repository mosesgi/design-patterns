package com.moses.designpatterns.singleton;

public class SingletonLazyHolder {
    //静态内部类，private保证全局唯一
    private static class LazyHolder{
        //final防止内部误操作
        private static final SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){}

    //final保证不被覆盖。方法中逻辑在用户调用时才开始执行，所需内存也是调用时才分配
    public static final SingletonLazyHolder getInstance(){
        return LazyHolder.instance;
    }
}
