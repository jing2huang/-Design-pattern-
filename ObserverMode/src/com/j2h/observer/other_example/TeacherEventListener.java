package com.j2h.observer.other_example;

//����۲����ࣺ��ʦ�¼�������
public class TeacherEventListener implements BellEventListener {

	@Override
	public void heardBell(RingEvent e) {
		if (e.isSound()) {
            System.out.println("��ʦ�Ͽ���...");
        } else {
            System.out.println("��ʦ�¿���...");
        }
	}

}