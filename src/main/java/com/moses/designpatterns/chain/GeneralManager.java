package com.moses.designpatterns.chain;

public class GeneralManager extends Approver {
    public GeneralManager(Approver superiorManager) {
        super(10000, superiorManager);
    }

    @Override
    protected void reply(Employee employee) {
        System.out.println(getCurrentApprover() + ": [After 3 days] Guys, have fun!");
    }

    @Override
    protected String getCurrentApprover() {
        return "General Manager";
    }
}
