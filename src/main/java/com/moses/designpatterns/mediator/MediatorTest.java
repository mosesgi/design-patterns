package com.moses.designpatterns.mediator;

public class MediatorTest {
    public static void main(String[] args) {
        MediatorImpl mediator = new MediatorImpl();
        HouseOwner owner = new HouseOwner("sssss", mediator);
        Tenant tenant = new Tenant("llll", mediator);

        mediator.setOwner(owner);
        mediator.setTenant(tenant);

        tenant.contact("有三室房子出租吗?");
        owner.contact("是的,你需要租吗?");
    }
}
