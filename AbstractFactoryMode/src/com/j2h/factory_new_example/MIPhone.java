package com.j2h.factory_new_example;

public class MIPhone implements ProductPhone {

	@Override
	public void sendMsg() {
		System.out.println("ʹ��С���ֻ�����Ϣ");
	}

	@Override
	public void call() {
		System.out.println("ʹ��С���ֻ���绰");
	}

}
