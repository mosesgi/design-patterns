package com.moses.designpatterns.chain;

/**
 * 责任链 模式
 */
public class ChainTest {
    public static void main(String[] args) {
        Employee emp = new Employee((int) (Math.random() * 13000));

        Approver gm = new GeneralManager(null);
        Approver sManager = new SeniorManager(gm);
        Approver manager = new Manager(sManager);

        manager.handleRequest(emp);
    }
}
