package com.j2h.observer.other_example;

import java.util.EventObject;

//�����¼��ࣺ���ڷ�װ�¼�Դ��һЩ���¼���صĲ���
public class RingEvent extends EventObject {

	private static final long serialVersionUID = 7808085900430800355L;
	private boolean sound; //true:�Ͽ���  false:�¿���
	
	public RingEvent(Object source, boolean sound) {
		super(source);
		this.sound = sound;
	}

	public boolean isSound() {
		return sound;
	}

	public void setSound(boolean sound) {
		this.sound = sound;
	}
}