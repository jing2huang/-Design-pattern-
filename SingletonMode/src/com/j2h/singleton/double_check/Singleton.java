package com.j2h.singleton.double_check;

//双检锁
public class Singleton {

	private static volatile Singleton singleton;
	
	private Singleton() {}; //私有、不允许其它类通过new来创建它的实例
	
	public static Singleton getSingleton() {
		if (singleton == null) { //竞争锁之前先确认内存中是否已存在，若已存在则避免了多余的锁竞争和加锁造成的资源消耗
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}