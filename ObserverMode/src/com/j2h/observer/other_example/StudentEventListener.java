package com.j2h.observer.other_example;

//����۲����ࣺѧ���¼�������
public class StudentEventListener implements BellEventListener {

	@Override
	public void heardBell(RingEvent e) {
		if (e.isSound()) {
            System.out.println("ͬѧ�ǣ��Ͽ���...");
        } else {
            System.out.println("ͬѧ�ǣ��¿���...");
        }
	}

}