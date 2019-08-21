package com.moses.designpatterns.chain;

public class Manager extends Approver {
    public Manager() {
        super(1000);
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
