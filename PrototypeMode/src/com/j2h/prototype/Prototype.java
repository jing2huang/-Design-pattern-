package com.j2h.prototype;

public class Prototype implements Cloneable {

	public void msg() {
		System.out.println("ԭ�Ͷ���clone�ɹ�");
	}
	
	@Override
	protected Prototype clone() throws CloneNotSupportedException {
		return (Prototype) super.clone();
	}

}