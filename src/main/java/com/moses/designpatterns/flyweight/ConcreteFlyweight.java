package com.moses.designpatterns.flyweight;

public class ConcreteFlyweight implements Flyweight {
    //内蕴状态 - 内蕴状态是存储在享元对象内部的，并且是不会随环境的改变而有所不同。因此，一个享元可以具有内蕴状态并可以共享。
    private String intrinsicState = null;

    /**
     * 构造函数，内蕴状态作为参数传入
     * @param intrinsicState
     */
    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    /**
     * 外蕴状态作为参数传入方法中，改变方法的行为，
     * 但是并不改变对象的内蕴状态。
     * @param state
     */
    @Override
    public void operation(String state) {
        System.out.println("Intrinsic State = " + this.intrinsicState);
        System.out.println("Extrinsic State = " + state);
    }
}
