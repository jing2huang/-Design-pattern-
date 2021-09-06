package com.j2h.vistor;

public class Client {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        Hero zhuang = new ZhuangHero();
        Hero zhen = new ZhenHero();
        os.addHero(zhuang);
        os.addHero(zhen);
        Player visitorMe = new PlayerMe();
        Player visitorOthers = new PlayerOthers();
        // �÷����߷��ʶ���ṹ�е�Ԫ��
        os.handleRequest(visitorMe);
        os.handleRequest(visitorOthers);
    }
}
