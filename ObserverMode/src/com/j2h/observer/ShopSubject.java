package com.j2h.observer;

//具体主题:购物主题
public class ShopSubject extends Subject {

	//具体业务
	public void doShop() {
		System.out.println("==========网购下单==========");
		super.notifyObservers();
	}

}