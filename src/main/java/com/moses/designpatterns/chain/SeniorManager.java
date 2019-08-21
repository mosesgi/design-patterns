package com.moses.designpatterns.chain;

public class SeniorManager extends Approver {
    public SeniorManager(Approver superiorManager) {
        super(5000, superiorManager);
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
