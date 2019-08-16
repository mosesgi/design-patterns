package com.moses.designpatterns.entities.buses;

import com.moses.designpatterns.entities.Bus;

public class BenzBus implements Bus {
    @Override
    public void carryPassengers() {
        System.out.println("Benz Bus carrying passengers.");
    }
}
