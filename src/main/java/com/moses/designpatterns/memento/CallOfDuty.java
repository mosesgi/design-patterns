package com.moses.designpatterns.memento;

/**
 * 游戏实体类 (Originator)
 */
public class CallOfDuty {
    private int checkPoint = 1;
    private int lifeValue = 100;
    private String weapon = "沙漠之鹰";

    public void play(){
        System.out.println("打游戏: 第" + checkPoint + "关, 奋战杀敌中");
        lifeValue -= 10;
        System.out.println("进度升级了");
        checkPoint++;
        System.out.println("到达第" + checkPoint + "关");
    }

    public void quit(){
        System.out.println("-----------------------");
        System.out.println("退出前的属性: " + this.toString());
        System.out.println("退出游戏");
        System.out.println("-----------------------");
    }

    public Memento createMemento(){
        Memento m = new Memento(this.checkPoint, this.lifeValue, this.weapon);
        return m;
    }

    public void restore(Memento memento){
        this.checkPoint = memento.getCheckPoint();
        this.lifeValue = memento.getLifeValue();
        this.weapon = memento.getWeapon();
        System.out.println("恢复后的游戏属性: " + this.toString());
    }

    @Override
    public String toString() {
        return "CallOfDuty{" +
                "checkPoint=" + checkPoint +
                ", lifeValue=" + lifeValue +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
