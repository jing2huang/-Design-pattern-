package com.j2h.state;

//����״̬������״̬
public class New extends ThreadState {

	public New() {
		state = "new";
		System.out.println("��ǰ�̴߳��ڣ��½�״̬...");
	}

	//�½�״̬��Ӧ����Ϊ
	public void start(ThreadContext ctx) {
		System.out.print("����start()����-->");
		if ("new".equals(state)) {
			ctx.setState(new Runnable());
		} else {
			System.out.println("��ǰ�̲߳����½�״̬�����ܵ���start()����");
		}
	}

}