package com.j2h.chainofresponsibility;

//���崦���ߣ����ž���
public class DepartManager extends Leader {

	@Override
	public void handleRequest(int leaveDays) {
		if (leaveDays <= 3) {
			System.out.println("�������������3�죬���ž�����׼��");
		} else {
			getNext().handleRequest(leaveDays);
		}
	}

}