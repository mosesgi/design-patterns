package com.moses.designpatterns.adapter;

import com.moses.designpatterns.entities.bags.AppleBag;
import com.moses.designpatterns.entities.bags.OrangeBag;
import com.moses.designpatterns.entities.fruits.Orange;

public class AdapterClient {

    public static void main(String[] args) {
        Orange orange = new Orange();
        OrangeBag bag = getOrangeBagUsingAppleBag();
        orange.pack(bag);
    }

    public static OrangeBag getOrangeBagUsingAppleBag(){
        AppleBag appleBag = new AppleBag();
        return new OrangeBagAdapter(appleBag);
    }
}
