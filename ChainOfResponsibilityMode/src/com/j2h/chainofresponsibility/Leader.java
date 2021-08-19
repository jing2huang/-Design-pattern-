package com.j2h.chainofresponsibility;

//�������ࣺ�쵼��
abstract class Leader {

	private Leader next;

	public Leader getNext() {
		return next;
	}

	public void setNext(Leader next) {
		this.next = next;
	}
	
	public abstract void handleRequest(int leaveDays);
}