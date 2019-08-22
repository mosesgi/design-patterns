package com.moses.designpatterns.flyweight;

public interface Flyweight {
    //state是一个外蕴状态.
    //外蕴状态是随环境的改变而改变的、不可以共享的。
    //享元对象的外蕴状态必须由客户端保存，并在享元对象被创建之后，在需要使用的时候再传入到享元对象内部。外蕴状态不可以影响享元对象的内蕴状态，它们是相互独立的。
    void operation(String state);
}
