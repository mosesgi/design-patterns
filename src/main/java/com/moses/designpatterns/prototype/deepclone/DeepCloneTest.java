package com.moses.designpatterns.prototype.deepclone;

public class DeepCloneTest {

    public static void main(String[] args) {
        TheGreatestSage origin = new TheGreatestSage();
        TheGreatestSage copy = (TheGreatestSage) origin.clone();
        System.out.println("大圣本尊生日: " + origin.getBirthday().getTime());
        System.out.println("克隆大圣生日: " + copy.getBirthday().getTime());

        System.out.println("大圣本尊与克隆大圣是否为同一对象: " + (origin == copy));
        System.out.println("持有的金箍棒是否为同一个对象: " + (origin.getRod() == copy.getRod()));
    }
}
