package com.moses.designpatterns.chain;

public abstract class Approver {
    private int authorizedExpense;
    private Approver superiorManager;

    public Approver(int authorizedExpense){
        this.authorizedExpense = authorizedExpense;
    }

    protected abstract void reply(Employee employee);

    public void handleRequest(Employee employee) {
        if(employee.getExpense() <= authorizedExpense){
            //在批复范围之内,直接批复
            reply(employee);
        } else {
            if(superiorManager != null) {
                //有上级则递交给上级批准
                System.out.println(getCurrentApprover() + ": Request requires superior manager's approval");
                superiorManager.handleRequest(employee);
            } else {
                System.out.println(getCurrentApprover() + ": Request rejected, too much money.");
            }
        }
    }

    public void setSuperiorManager(Approver superiorManager) {
        this.superiorManager = superiorManager;
    }

    protected abstract String getCurrentApprover();
}
