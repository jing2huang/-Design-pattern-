package com.j2h.mediator;

//具体同事类：美国
public class USA extends Country {

	public USA(UnitedNations unitedNations) {
		super(unitedNations);
	}

	public void declare(String msg) {
		unitedNations.declare(msg, this);
	}
	
	public void getMessage(String msg) {
		System.out.println("USA收到消息【" + msg + "】");
	}
}