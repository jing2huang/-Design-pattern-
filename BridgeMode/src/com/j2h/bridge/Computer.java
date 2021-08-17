package com.j2h.bridge;

//抽象化角色：电脑类型维度
public abstract class Computer {

	protected Brand brand;
	
	public Computer(Brand brand) {
		this.brand = brand;
	}
	
	public abstract void sale();
}