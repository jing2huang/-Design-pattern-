package com.j2h.dynamic_proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {

	@Override
	public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("买车前寻找车源、车辆质量检测等准备工作！");
		Object result = methodProxy.invokeSuper(object, args);
		System.out.println("买车后落户、上保险等工作！");
		return result;
	}
}