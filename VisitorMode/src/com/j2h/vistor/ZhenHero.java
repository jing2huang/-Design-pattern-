package com.j2h.vistor;

//具体元素：甄姬
public class ZhenHero extends Hero {

    //可以接受玩家的操作
    @Override
    public void accept(Player visitor) {
        visitor.visitZhen(this);
    }

    //自身的技能
    public void operate() {
        System.out.println("甄姬放出了技能");
    }
}