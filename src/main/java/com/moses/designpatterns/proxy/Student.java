package com.moses.designpatterns.proxy;

public class Student implements Person {
    @Override
    public void buyTicket() {
        System.out.println("Student - I want to buy ticket!");
    }
}
