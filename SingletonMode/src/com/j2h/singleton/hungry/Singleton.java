package com.j2h.singleton.hungry;

//¶öººÊ½
public class Singleton {

	private static Singleton singleton = new Singleton();
	
	public static Singleton getSingleton() {
		return singleton;
	}

}