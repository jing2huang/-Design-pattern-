package com.j2h.observer;

//��������:��������
public class ShopSubject extends Subject {

	//����ҵ��
	public void doShop() {
		System.out.println("==========�����µ�==========");
		super.notifyObservers();
	}

}