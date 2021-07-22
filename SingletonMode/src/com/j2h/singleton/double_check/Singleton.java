package com.j2h.singleton.double_check;

//˫����
public class Singleton {

	private static volatile Singleton singleton;
	
	public static Singleton getSingleton() {
		if (singleton == null) { //������֮ǰ��ȷ���ڴ����Ƿ��Ѵ��ڣ����Ѵ���������˶�����������ͼ�����ɵ���Դ����
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}