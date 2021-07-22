package com.j2h.singleton.lazy.safe;

public class Singleton {

	private static Singleton singleton;
	
	public static synchronized Singleton getSingleton() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}