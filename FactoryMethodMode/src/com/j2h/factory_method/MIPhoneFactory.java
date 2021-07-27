package com.j2h.factory_method;

//小米手机的工厂
public class MIPhoneFactory implements Factory {

	@Override
	public Phone newProduct() {
		return new MIPhone();
	}

}