package com.j2h.vistor;

//��������ߣ���
public class PlayerMe implements Player {

    @Override
    public void visitZhuang(ZhuangHero element) {
        System.out.println("�ҷ���ׯ�ܣ�ׯ�ܿ�ʼʹ������");
        element.operate();
    }

    @Override
    public void visitZhen(ZhenHero element) {
        System.out.println("�ҷ����缧���缧��ʼʹ������");
        element.operate();
    }
}
