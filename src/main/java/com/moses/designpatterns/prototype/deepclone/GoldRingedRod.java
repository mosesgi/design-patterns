package com.moses.designpatterns.prototype.deepclone;

import java.io.Serializable;

public class GoldRingedRod implements Serializable {
    private float height = 100;
    private float diameter = 10;

    /**
     * 金箍棒变大
     */
    public void grow(){
        height *=2;
        diameter*=2;
    }

    /**
     * 金箍棒缩小
     */
    public void shrink(){
        diameter/=2;
        height/=2;
    }
}
