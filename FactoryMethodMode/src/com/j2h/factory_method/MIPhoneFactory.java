package com.j2h.factory_method;

//С���ֻ��Ĺ���
public class MIPhoneFactory implements Factory {

	@Override
	public Product newProduct() {
		return new MIPhone();
	}

}