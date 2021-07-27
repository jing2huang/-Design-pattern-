package com.j2h.factory_new_example;

//具体工厂：负责生产小米这一族的产品（包括手机、电脑等）
public class MIFactory implements Factory {

	@Override
	public ProductPhone newPhone() {
		return new MIPhone();
	}

	@Override
	public ProductPC newPC() {
		return new MIPC();
	}

}