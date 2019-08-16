package com.moses.designpatterns.entities.buses;

import com.moses.designpatterns.entities.Bus;

public class AudiBus implements Bus {
    @Override
    public void carryPassengers() {
        System.out.println("Audi Bus carrying passengers.");
    }
}
