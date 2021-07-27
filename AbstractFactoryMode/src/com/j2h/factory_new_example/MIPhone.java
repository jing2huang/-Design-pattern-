package com.j2h.factory_new_example;

public class MIPhone implements ProductPhone {

	@Override
	public void sendMsg() {
		System.out.println("使用小米手机发消息");
	}

	@Override
	public void call() {
		System.out.println("使用小米手机打电话");
	}

}
