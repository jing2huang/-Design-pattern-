package com.j2h.decorator;

//��װ�ζ���
public class AppData implements Data {

	@Override
	public void send() {
		System.out.println("app��������!");
	}

}