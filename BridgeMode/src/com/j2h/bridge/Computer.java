package com.j2h.bridge;

//���󻯽�ɫ����������ά��
public abstract class Computer {

	protected Brand brand;
	
	public Computer(Brand brand) {
		this.brand = brand;
	}
	
	public abstract void sale();
}