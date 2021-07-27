package com.j2h.factory_method;

public class HWPhone implements Phone {

	@Override
	public void sendMsg() {
		System.out.println("使用华为手机发送消息");
	}
	
	@Override
	public void call() {
		System.out.println("使用华为手机打电话");
	}
}
