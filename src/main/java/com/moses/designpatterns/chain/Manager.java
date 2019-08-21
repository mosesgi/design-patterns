package com.moses.designpatterns.chain;

public class Manager extends Approver {
    public Manager(Approver superiorManager) {
        super(1000, superiorManager);
    }

    @Override
    protected void reply(Employee employee) {
        System.out.println(getCurrentApprover() + ": I'm okay with the request, approved!");
    }

    @Override
    protected String getCurrentApprover() {
        return "Manager";
    }

}
