package com.j2h.mediator;

public class CHINA extends Country {

	public CHINA(UnitedNations unitedNations) {
		super(unitedNations);
	}

	public void declare(String msg) {
		unitedNations.declare(msg, this);
	}
	
	public void getMessage(String msg) {
		System.out.println("CHINA收到消息【" + msg + "】");
	}
}