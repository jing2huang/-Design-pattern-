package com.j2h.static_proxy;

//代理类
public class BuyCarProxy implements BuyCar {
	
	private BuyCar buy;
	
	public BuyCarProxy(BuyCar buy) {
		this.buy = buy;
	}
	
	@Override
	public void buyCar() {
		System.out.println("买车前寻找车源、车辆质量检测等准备工作！");
		buy.buyCar();
		System.out.println("买车后落户、上保险等工作！");
	}
}
