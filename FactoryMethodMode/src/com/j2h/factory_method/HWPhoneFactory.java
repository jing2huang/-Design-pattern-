package com.j2h.factory_method;

//���ÿһ�ֲ�Ʒ�ṩһ����������Ϊ�ֻ��Ĺ���
public class HWPhoneFactory implements Factory {

		@Override
		public Product newProduct() {
			return new HWPhone();
		}

}