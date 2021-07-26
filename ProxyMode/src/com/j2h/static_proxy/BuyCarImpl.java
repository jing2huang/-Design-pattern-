package com.j2h.static_proxy;

//被代理类
//客户：真实买车实现类
public class BuyCarImpl implements BuyCar {
	
	@Override
	public void buyCar() {
		System.out.println("我买了一辆车！");
	}

}