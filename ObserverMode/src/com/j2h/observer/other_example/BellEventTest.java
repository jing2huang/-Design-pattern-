package com.j2h.observer.other_example;

public class BellEventTest {

	public static void main(String[] args) {
        BellEventSource bell = new BellEventSource();    //�壨�¼�Դ��
        bell.registerEventListener(new TeacherEventListener()); //ע�����������ʦ��
        bell.registerEventListener(new StudentEventListener());    //ע���������ѧ����
        bell.ring(true);   //���Ͽ�����
        System.out.println("------------");
        bell.ring(false);  //���¿�����
	}
}