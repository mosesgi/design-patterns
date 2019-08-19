package com.moses.designpatterns.decorator;

public class DecoratorTest {

    static void printCoffee(Coffee coffee){
        System.out.println("花费了: " + coffee.getCost());
        System.out.println("配料: " + coffee.getIngredients());
        System.out.println("----------------------------");
    }
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        printCoffee(coffee);

        coffee = new WithMilk(coffee);
        printCoffee(coffee);

        coffee = new WithSugar(coffee);
        printCoffee(coffee);
    }
}
