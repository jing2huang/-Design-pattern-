package com.j2h.factory_new_example;

public class MIPC implements ProductPC {

	@Override
	public void sendEmail() {
		System.out.println("ʹ��С��PC���ʼ�");
	}

	@Override
	public void internet() {
		System.out.println("ʹ��С��PC����");
	}

}