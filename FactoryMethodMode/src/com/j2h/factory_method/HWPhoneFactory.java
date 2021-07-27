package com.j2h.factory_method;

//针对每一种产品提供一个工厂：华为手机的工厂
public class HWPhoneFactory implements Factory {

		@Override
		public Phone newProduct() {
			return new HWPhone();
		}

}