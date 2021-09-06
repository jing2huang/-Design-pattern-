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
        // 让访问者访问对象结构中的元素
        os.handleRequest(visitorMe);
        os.handleRequest(visitorOthers);
    }
}
