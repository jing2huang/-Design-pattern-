package com.j2h.dynamic_proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//动态代理处理器
public class JDKProxyHandler implements InvocationHandler {

	private Object obj;
	
	public JDKProxyHandler(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("买车前寻找车源、车辆质量检测等准备工作！");
		Object result = method.invoke(obj, args);
		System.out.println("买车后落户、上保险等工作！");
		return result;
	}

}