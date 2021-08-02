package com.j2h.observer;

public class ObservetTest {

	public static void main(String[] args) {
		//创建主题
		ShopSubject subject = new ShopSubject();
		//定义观察者
		subject.addObserver(new PayObserver());
		subject.addObserver(new InventoryObserver());
		subject.addObserver(new IntegralObserver());
		//具体业务
		subject.doShop();
	}

}