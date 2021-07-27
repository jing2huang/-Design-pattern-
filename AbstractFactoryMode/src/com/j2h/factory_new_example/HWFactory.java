package com.j2h.factory_new_example;

//���幤��������������Ϊ��һ��Ĳ�Ʒ
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