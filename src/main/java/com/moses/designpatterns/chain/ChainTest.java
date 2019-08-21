package com.moses.designpatterns.chain;

/**
 * 责任链 模式
 */
public class ChainTest {
    public static void main(String[] args) {
        Employee emp = new Employee((int) (Math.random() * 13000));

        Approver manager = new Manager();
        Approver sManager = new SeniorManager();
        Approver gm = new GeneralManager();

        manager.setSuperiorManager(sManager);
        sManager.setSuperiorManager(gm);

        manager.handleRequest(emp);
    }
}
