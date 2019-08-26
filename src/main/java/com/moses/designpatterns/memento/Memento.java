package com.moses.designpatterns.memento;

public class Memento {
    private int checkPoint;
    private int lifeValue;
    private String weapon;

    public Memento(int checkPoint, int lifeValue, String weapon) {
        this.checkPoint = checkPoint;
        this.lifeValue = lifeValue;
        this.weapon = weapon;
    }

    public int getCheckPoint() {
        return checkPoint;
    }

    public void setCheckPoint(int checkPoint) {
        this.checkPoint = checkPoint;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        this.lifeValue = lifeValue;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "checkPoint=" + checkPoint +
                ", lifeValue=" + lifeValue +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
