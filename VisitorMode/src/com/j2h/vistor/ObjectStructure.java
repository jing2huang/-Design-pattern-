package com.j2h.vistor;

import java.util.ArrayList;
import java.util.List;

//����ṹ
public class ObjectStructure {

    //����������Ҫ�����ʵ�Ԫ��
    private List<Hero> heros = new ArrayList<Hero>();

    public void handleRequest(Player visitor) {
        //��������Ԫ��
        for(Hero hero : heros) {
            hero.accept(visitor);
        }
    }

    public void addHero(Hero hero) {
        heros.add(hero);
    }
}
