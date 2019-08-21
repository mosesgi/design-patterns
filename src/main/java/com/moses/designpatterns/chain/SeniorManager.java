package com.moses.designpatterns.chain;

public class SeniorManager extends Approver {
    public SeniorManager() {
        super(3000);
    }

    @Override
    protected void reply(Employee employee) {
        System.out.println(getCurrentApprover() + ": [Wait for 2 days] Sure, please go ahead!");
    }

    @Override
    protected String getCurrentApprover() {
        return "Senior Manager";
    }
}
