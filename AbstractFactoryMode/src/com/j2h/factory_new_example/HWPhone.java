package com.j2h.factory_new_example;

//�����Ʒ����Ϊ��һ���ֻ���Ʒ
public class HWPhone implements ProductPhone {

	@Override
	public void sendMsg() {
		System.out.println("ʹ�û�Ϊ�ֻ�����Ϣ");
	}

	@Override
	public void call() {
		System.out.println("ʹ�û�Ϊ�ֻ���绰");
	}

}