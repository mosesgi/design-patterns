package com.moses.designpatterns.entities.buses;

import com.moses.designpatterns.entities.Bus;

public class BmwBus implements Bus {
    @Override
    public void carryPassengers() {
        System.out.println("BMW Bus carrying passengers");
    }
}
