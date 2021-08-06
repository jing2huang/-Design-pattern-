package com.j2h.state;

//����״̬�ࣺ����״̬
public class Running extends ThreadState {

	public Running() {
		state = "running";
		System.out.println("��ǰ�̴߳��ڣ�����״̬...");
	}

	//����״̬��Ӧ����Ϊ
    public void suspend(ThreadContext ctx) {
        System.out.print("����suspend()����-->");
        if ("running".equals(state)) {
        	ctx.setState(new Blocked());
        } else {
            System.out.println("��ǰ�̲߳�������״̬�����ܵ���suspend()����.");
        }
    }

    public void stop(ThreadContext ctx) {
        System.out.print("����stop()����-->");
        if ("running".equals(state)) {
        	ctx.setState(new Dead());
        } else {
            System.out.println("��ǰ�̲߳�������״̬�����ܵ���stop()����.");
        }
    }
}