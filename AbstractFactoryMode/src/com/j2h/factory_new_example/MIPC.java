package com.j2h.factory_new_example;

public class MIPC implements ProductPC {

	@Override
	public void sendEmail() {
		System.out.println("使用小米PC发邮件");
	}

	@Override
	public void internet() {
		System.out.println("使用小米PC上网");
	}

}