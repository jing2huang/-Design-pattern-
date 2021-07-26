package com.j2h.dynamic_proxy.cglib;

import com.j2h.static_proxy.BuyCarImpl;

import net.sf.cglib.proxy.Enhancer;

public class CglibDynamicProxyTest {

	public static void main(String[] args) {
		System.out.println("====CGLIB��̬����====");
		//Cglib�ֽ�����ǿ��
		Enhancer enhancer = new Enhancer();
		//�̳б�������
		enhancer.setSuperclass(BuyCarImpl.class);
		//���ûص�
		enhancer.setCallback(new CglibProxy());
		//�������������
		BuyCarImpl buyProxy = (BuyCarImpl) enhancer.create();
		buyProxy.buyCar();
	}
}