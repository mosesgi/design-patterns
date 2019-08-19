package com.moses.designpatterns.adapter;

import com.moses.designpatterns.entities.bags.AppleBag;
import com.moses.designpatterns.entities.bags.OrangeBag;

/**
 * 使用苹果包装袋 包装 橙子 的适配器
 */
public class OrangeBagAdapter extends OrangeBag {
    private AppleBag appleBag;

    public OrangeBagAdapter(AppleBag appleBag){
        this.appleBag = appleBag;
    }

    @Override
    public void pack() {
        appleBag.pack();
    }
}
