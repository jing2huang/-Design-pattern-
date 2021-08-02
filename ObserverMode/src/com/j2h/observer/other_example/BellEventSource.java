package com.j2h.observer.other_example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Ŀ���ࣨ���⣩���¼�Դ
public class BellEventSource {
	//����������
	private List<BellEventListener> listeners;

	public BellEventSource() {
		listeners = new ArrayList<>();
	}

	//�¼�Դ�󶨼�����
	public void registerEventListener(BellEventListener listener) {
		listeners.add(listener);
	}

	//�¼�������
    public void ring(boolean sound) {
        String type = sound ? "�Ͽ���" : "�¿���";
        System.out.println(type + "�죡");
        RingEvent event = new RingEvent(this, sound);
        //֪ͨע���ڸ��¼�Դ�ϵ����м�����
        notifies(event);
    }

    protected void notifies(RingEvent e) {
        BellEventListener listener = null;
        Iterator<BellEventListener> iterator = listeners.iterator();
        while (iterator.hasNext()) {
        	listener = iterator.next();
        	listener.heardBell(e);
        }
    }
}