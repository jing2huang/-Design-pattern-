package com.j2h.observer;

public class ObservetTest {

	public static void main(String[] args) {
		//��������
		ShopSubject subject = new ShopSubject();
		//����۲���
		subject.addObserver(new PayObserver());
		subject.addObserver(new InventoryObserver());
		subject.addObserver(new IntegralObserver());
		//����ҵ��
		subject.doShop();
	}

}