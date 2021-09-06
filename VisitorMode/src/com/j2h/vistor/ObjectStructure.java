package com.j2h.vistor;

import java.util.ArrayList;
import java.util.List;

//对象结构
public class ObjectStructure {

    //保存所有需要被访问的元素
    private List<Hero> heros = new ArrayList<Hero>();

    public void handleRequest(Player visitor) {
        //访问所有元素
        for(Hero hero : heros) {
            hero.accept(visitor);
        }
    }

    public void addHero(Hero hero) {
        heros.add(hero);
    }
}
