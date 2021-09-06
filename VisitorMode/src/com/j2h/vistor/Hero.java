package com.j2h.vistor;

//抽象元素：英雄类
public abstract class Hero {
    //英雄可以接受玩家的访问，让玩家来操作
    public abstract void accept(Player visitor);
}