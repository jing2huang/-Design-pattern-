package com.j2h.state;

//����״̬�ࣺ����״̬
public class Runnable extends ThreadState {

	public Runnable() {
		state = "runnable";
		System.out.println("�̵߳�ǰ���ڣ�����״̬...");
	}
	
	//����״̬��Ӧ����Ϊ
	public void getCPU(ThreadContext ctx) {
		System.out.print("����CPU��Դ-->");
		if ("runnable".equals(state)) {
			ctx.setState(new Running());
		} else {
			System.out.println("��ǰ�̲߳��Ǿ���״̬�����ܾ���CPU��Դ...");
		}
	}

}