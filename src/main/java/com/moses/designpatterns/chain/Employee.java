package com.moses.designpatterns.chain;

public class Employee {

    private int expense;
    private String applyMsg = "团建报销";

    public Employee(int expense){
        this.expense = expense;
        System.out.println(getApplyMsg() + ":" + expense);
    }

    public int getExpense() {
        return expense;
    }

    public String getApplyMsg() {
        return applyMsg;
    }
}
