package com.j2h.singleton.hungry;

//����ʽ
public class Singleton {

	private static Singleton singleton = new Singleton();
	
	public static Singleton getSingleton() {
		return singleton;
	}

}