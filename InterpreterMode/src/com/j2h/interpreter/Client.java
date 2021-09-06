package com.j2h.interpreter;

public class Client {
    public static void main(String[] args) {
        Context bus = new Context();
        bus.ride("韶关的老人");
        bus.ride("韶关的年轻人");
        bus.ride("广州的妇女");
        bus.ride("广州的儿童");
        bus.ride("山东的儿童");
    }
}
