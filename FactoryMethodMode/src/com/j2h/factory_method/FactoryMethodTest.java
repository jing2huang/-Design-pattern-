package com.j2h.factory_method;

public class FactoryMethodTest {

	public static void main(String[] args) {
		Factory miFactory = new MIPhoneFactory();
		Phone miPhone = miFactory.newProduct();
		miPhone.sendMsg();
		miPhone.call();
		
		Factory hwFactory = new HWPhoneFactory();
		Phone hwPhone = hwFactory.newProduct();
		hwPhone.sendMsg();
		hwPhone.call();
	}

}