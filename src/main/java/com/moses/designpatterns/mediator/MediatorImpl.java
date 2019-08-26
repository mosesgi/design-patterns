package com.moses.designpatterns.mediator;

public class MediatorImpl extends Mediator {
    private HouseOwner owner;
    private Tenant tenant;

    @Override
    public void contact(String message, Person person) {
        if(person == owner){
            tenant.getMessage(message);
        } else {
            owner.getMessage(message);
        }
    }

    public HouseOwner getOwner() {
        return owner;
    }

    public void setOwner(HouseOwner owner) {
        this.owner = owner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
}
