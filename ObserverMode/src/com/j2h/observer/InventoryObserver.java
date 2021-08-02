package com.j2h.observer;

//库存系统观察者
public class InventoryObserver implements Observer {

	@Override
	public void handle() {
		System.out.println("收到下单通知，进行库存更新处理...");
	}

}