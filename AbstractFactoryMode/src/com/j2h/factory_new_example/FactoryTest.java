package com.j2h.factory_new_example;

public class FactoryTest {

	public static void main(String[] args) {
		Factory miFactory = new MIFactory();
		ProductPhone miPhone = miFactory.newPhone();
		miPhone.sendMsg();
		miPhone.call();
		ProductPC miPC = miFactory.newPC();
		miPC.sendEmail();
		miPC.internet();
	}

}