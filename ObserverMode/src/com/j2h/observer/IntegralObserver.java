package com.j2h.observer;

//积分观察者
public class IntegralObserver implements Observer {

	@Override
	public void handle() {
		System.out.println("收到下单通知，进行用户积分更新处理...");
	}

}