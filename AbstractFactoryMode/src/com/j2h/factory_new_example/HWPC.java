package com.j2h.factory_new_example;

//�����Ʒ����Ϊ��һ��ĵ��Բ�Ʒ
public class HWPC implements ProductPC {

	@Override
	public void sendEmail() {
		System.out.println("ʹ�û�ΪPC���ʼ�");
	}

	@Override
	public void internet() {
		System.out.println("ʹ�û�ΪPC����");
	}

}