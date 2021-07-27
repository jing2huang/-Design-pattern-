package com.j2h.factory_new_example;

//具体产品：华为这一族的电脑产品
public class HWPC implements ProductPC {

	@Override
	public void sendEmail() {
		System.out.println("使用华为PC发邮件");
	}

	@Override
	public void internet() {
		System.out.println("使用华为PC上网");
	}

}