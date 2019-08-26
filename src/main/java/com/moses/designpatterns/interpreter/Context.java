package com.moses.designpatterns.interpreter;

public class Context {
    private String[] cities = {"苏州", "南京"};
    private String[] persons = {"老人", "儿童"};

    private Expression cityPerson;

    public Context(){
        Expression city = new TerminalExpression(cities);
        Expression person = new TerminalExpression(persons);
        cityPerson = new AndExpression(city, person);
    }

    public void freeRide(String info){
        boolean free = cityPerson.interpret(info);
        if(free){
            System.out.println("您是" + info + ", 本次乘车免费! ");
        } else {
            System.out.println(info + ", 您不是免费人员,本次乘车扣费2元.");
        }
    }
}
