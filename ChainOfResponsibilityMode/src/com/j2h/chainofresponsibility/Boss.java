package com.j2h.chainofresponsibility;

//���崦���ߣ��ϰ�
public class Boss extends Leader {

	@Override
	public void handleRequest(int leaveDays) {
		if (leaveDays <= 15) {
			System.out.println("�����������3�쵫������15�죬��BOSS������׼��");
		} else {
			System.out.println("����������࣬BOSS������׼��");
		}
	}
}