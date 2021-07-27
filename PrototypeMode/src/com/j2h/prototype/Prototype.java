package com.j2h.prototype;

public class Prototype implements Cloneable {

	public void msg() {
		System.out.println("原型对象clone成功");
	}
	
	@Override
	protected Prototype clone() throws CloneNotSupportedException {
		return (Prototype) super.clone();
	}

}