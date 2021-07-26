package com.j2h.dynamic_proxy.cglib;

import com.j2h.static_proxy.BuyCarImpl;

import net.sf.cglib.proxy.Enhancer;

public class CglibDynamicProxyTest {

	public static void main(String[] args) {
		System.out.println("====CGLIB动态代理====");
		//Cglib字节码增强器
		Enhancer enhancer = new Enhancer();
		//继承被代理类
		enhancer.setSuperclass(BuyCarImpl.class);
		//设置回调
		enhancer.setCallback(new CglibProxy());
		//创建代理类对象
		BuyCarImpl buyProxy = (BuyCarImpl) enhancer.create();
		buyProxy.buyCar();
	}
}