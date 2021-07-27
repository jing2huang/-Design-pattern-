package com.j2h.factory_new_example;

//具体工厂：负责生产华为这一族的产品
public class HWFactory implements Factory {

	@Override
	public ProductPhone newPhone() {
		return new HWPhone();
	}

	@Override
	public ProductPC newPC() {
		return new HWPC();
	}

}