package com.j2h.dynamic_proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//��̬��������
public class JDKProxyHandler implements InvocationHandler {

	private Object obj;
	
	public JDKProxyHandler(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("��ǰѰ�ҳ�Դ��������������׼��������");
		Object result = method.invoke(obj, args);
		System.out.println("�򳵺��仧���ϱ��յȹ�����");
		return result;
	}

}