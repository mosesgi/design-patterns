package com.moses.designpatterns.prototype.deepclone;

import java.io.*;
import java.util.Date;

public class TheGreatestSage implements Cloneable, Serializable {
    private int height;
    private int weight;
    private Date birthday;
    private GoldRingedRod rod;

    public TheGreatestSage() {
        this.rod = new GoldRingedRod();
        this.birthday = new Date();
        this.height = 150;
        this.weight = 30;
        System.out.println("-----------------------");
    }

    /**
     * 使用序列化,反序列化深度克隆
     * @return
     */
    public Object clone(){
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            TheGreatestSage copy = (TheGreatestSage) ois.readObject();

            copy.birthday = new Date();
            return copy;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } finally {
            try{
                if(bos != null) bos.close();
                if(oos != null) oos.close();
                if(bis != null) bis.close();
                if(ois != null) ois.close();
            } catch (IOException e1){
                e1.printStackTrace();
            }
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public GoldRingedRod getRod() {
        return rod;
    }

    public void setRod(GoldRingedRod rod) {
        this.rod = rod;
    }
}
