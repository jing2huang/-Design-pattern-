package com.j2h.factory_method;

public class MIPhone implements Product {
	@Override
	public void call() {
		System.out.println("ʹ��С���ֻ���绰");
	}
	
	@Override
	public void sendMsg() {
		System.out.println("ʹ��С���ֻ�����Ϣ");
	}
}
