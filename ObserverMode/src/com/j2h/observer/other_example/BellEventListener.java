package com.j2h.observer.other_example;

import java.util.EventListener;

//����۲��ߣ������¼�������
public interface BellEventListener extends EventListener {

	//�¼�����������������
	public void heardBell(RingEvent e);
}