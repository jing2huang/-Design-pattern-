package com.j2h.factory_new_example;

//具体产品：华为这一族手机产品
public class HWPhone implements ProductPhone {

	@Override
	public void sendMsg() {
		System.out.println("使用华为手机发消息");
	}

	@Override
	public void call() {
		System.out.println("使用华为手机打电话");
	}

}