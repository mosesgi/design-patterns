package com.moses.designpatterns.entities;

import com.moses.designpatterns.visit.Visit;

public interface Fruit {

    int price();

    int accept(Visit visit);
}
