package com.j2h.vistor;

//����Ԫ�أ��缧
public class ZhenHero extends Hero {

    //���Խ�����ҵĲ���
    @Override
    public void accept(Player visitor) {
        visitor.visitZhen(this);
    }

    //����ļ���
    public void operate() {
        System.out.println("�缧�ų��˼���");
    }
}