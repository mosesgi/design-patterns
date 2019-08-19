package com.moses.designpatterns.decorator;

public class WithMilk extends CoffeeDecorator {
    public WithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        double milkCost = 0.5;
        return super.getCost() + milkCost;
    }

    @Override
    public String getIngredients() {
        String milk = "milk";
        return super.getIngredients() + ", " + milk;
    }
}
