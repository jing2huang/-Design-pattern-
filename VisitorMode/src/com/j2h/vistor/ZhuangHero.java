package com.j2h.vistor;

//����Ԫ�أ�ׯ��
public class ZhuangHero extends Hero {

    //�����ⲿ�ķ���
    @Override
    public void accept(Player visitor) {
        visitor.visitZhuang(this);
    }

    //����ļ���
    public void operate() {
        System.out.println("ׯ�ܷų��˼���");
    }
}
