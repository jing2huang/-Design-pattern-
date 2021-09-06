package com.j2h.vistor;

//抽象访问者：玩家可以访问甄姬和庄周的技能
public interface Player {
    public abstract void visitZhuang(ZhuangHero element);
    public abstract void visitZhen(ZhenHero element);
}