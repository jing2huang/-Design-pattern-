package com.j2h.factory_new_example;

//���幤������������С����һ��Ĳ�Ʒ�������ֻ������Եȣ�
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