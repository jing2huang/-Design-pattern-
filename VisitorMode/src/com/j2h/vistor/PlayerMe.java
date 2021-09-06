package com.j2h.vistor;

//具体访问者：我
public class PlayerMe implements Player {

    @Override
    public void visitZhuang(ZhuangHero element) {
        System.out.println("我访问庄周，庄周开始使出技能");
        element.operate();
    }

    @Override
    public void visitZhen(ZhenHero element) {
        System.out.println("我访问甄姬，甄姬开始使出技能");
        element.operate();
    }
}
