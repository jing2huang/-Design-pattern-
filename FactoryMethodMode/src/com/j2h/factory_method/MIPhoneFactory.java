package com.j2h.factory_method;

//С���ֻ��Ĺ���
public class MIPhoneFactory implements Factory {

	@Override
	public Phone newProduct() {
		return new MIPhone();
	}

}