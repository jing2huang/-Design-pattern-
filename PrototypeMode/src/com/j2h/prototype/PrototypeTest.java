package com.j2h.prototype;

public class PrototypeTest {

	public static void main(String[] args) {
		try {
			Prototype p = new Prototype();
			Prototype pClone = p.clone();
			pClone.msg();
			System.out.println(p == pClone); //false
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}