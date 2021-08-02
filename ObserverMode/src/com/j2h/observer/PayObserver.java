package com.j2h.observer;

//具体观察者（支付平台）
public class PayObserver implements Observer {

	@Override
	public void handle() {
		System.out.println("收到下单通知，进行订单支付处理...");
	}

}