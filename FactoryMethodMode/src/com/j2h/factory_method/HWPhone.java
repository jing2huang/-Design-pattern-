package com.j2h.factory_method;

public class HWPhone implements Phone {

	@Override
	public void sendMsg() {
		System.out.println("ʹ�û�Ϊ�ֻ�������Ϣ");
	}
	
	@Override
	public void call() {
		System.out.println("ʹ�û�Ϊ�ֻ���绰");
	}
}
