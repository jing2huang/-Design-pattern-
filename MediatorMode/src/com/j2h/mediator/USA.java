package com.j2h.mediator;

//����ͬ���ࣺ����
public class USA extends Country {

	public USA(UnitedNations unitedNations) {
		super(unitedNations);
	}

	public void declare(String msg) {
		unitedNations.declare(msg, this);
	}
	
	public void getMessage(String msg) {
		System.out.println("USA�յ���Ϣ��" + msg + "��");
	}
}