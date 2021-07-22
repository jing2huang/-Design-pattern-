package com.j2h.singleton.lazy.unsafe;

public class Singleton {

	private static Singleton singleton;
	
	public static Singleton getSingleton() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}