package com.j2h.singleton;

import com.j2h.singleton.double_check.Singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		System.out.println(s1 == s2);
	}

}