package com.j2h.factory_method;

public class MIPhone implements Phone {
	@Override
	public void call() {
		System.out.println("使用小米手机打电话");
	}
	
	@Override
	public void sendMsg() {
		System.out.println("使用小米手机发信息");
	}
}
