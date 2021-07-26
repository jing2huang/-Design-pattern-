package com.j2h.dynamic_proxy.jdk;

import java.lang.reflect.Proxy;

import com.j2h.static_proxy.BuyCar;
import com.j2h.static_proxy.BuyCarImpl;

public class JDKDynamicProxyTest {

	public static void main(String[] args) {
		System.out.println("====JDK��̬����====");
		//JDK��̬�������ڽӿ�
		BuyCar buy = new BuyCarImpl();
		//�����������
		BuyCar buyProxy = (BuyCar) Proxy.newProxyInstance(buy.getClass().getClassLoader(), new Class[] {BuyCar.class}, new JDKProxyHandler(buy));
		buyProxy.buyCar();
	}

}