package com.j2h.bridge;

//具体抽象化角色：台式机
public class Desktop extends Computer {

	public Desktop(Brand brand) {
		super(brand);
	}

	@Override
	public void sale() {
		System.out.print("台式机：");
		brand.sale();
	}

}
