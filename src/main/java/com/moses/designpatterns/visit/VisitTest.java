package com.moses.designpatterns.visit;

import com.moses.designpatterns.entities.Fruit;
import com.moses.designpatterns.entities.fruits.Apple;
import com.moses.designpatterns.entities.fruits.Banana;
import com.moses.designpatterns.entities.fruits.Orange;

import java.util.ArrayList;
import java.util.List;

public class VisitTest {
    private static Visit visit = new Visit();
    private static List<Fruit> list = new ArrayList<>();

    static{
        list.add(new Apple());
        list.add(new Orange());
        list.add(new Banana());
        list.add(new Apple());
        list.add(new Orange());
    }

    private static int price(){
        int total = 0;
        for(Fruit fruit : list){
            total += fruit.accept(visit);
        }
        System.out.println("total value: " + total);
        return total;
    }

    private static void test1(){
        Apple apple = new Apple();
        Fruit fruit = apple;

        int price = visit.sell(fruit);//不能识别fruit对象的真实类型
        System.out.println("fruit价格：" + price);

        price = visit.sell(apple);
        System.out.println("apple价格：" + price);
    }

    private static void test2(){
        Apple apple = new Apple();
        Fruit fruit = apple;

        int price = fruit.accept(visit);
        System.out.println("价格：" + price);
    }

    public static void main(String[] args) {
        price();
    }
}
