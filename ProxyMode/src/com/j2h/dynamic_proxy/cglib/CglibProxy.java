package com.j2h.dynamic_proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {

	@Override
	public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("��ǰѰ�ҳ�Դ��������������׼��������");
		Object result = methodProxy.invokeSuper(object, args);
		System.out.println("�򳵺��仧���ϱ��յȹ�����");
		return result;
	}
}