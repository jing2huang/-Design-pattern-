package com.j2h.vistor;

//具体元素：庄周
public class ZhuangHero extends Hero {

    //接受外部的访问
    @Override
    public void accept(Player visitor) {
        visitor.visitZhuang(this);
    }

    //自身的技能
    public void operate() {
        System.out.println("庄周放出了技能");
    }
}
