package com.j2h.state;

//����״̬�ࣺ����״̬
public class Blocked extends ThreadState {

	public Blocked() {
        state = "blocked";
        System.out.println("��ǰ�̴߳��ڣ�����״̬.");
    }

	//����״̬��Ӧ����Ϊ
    public void resume(ThreadContext ctx) {
        System.out.print("����resume()����-->");
        if ("blocked".equals(state)) {
        	ctx.setState(new Runnable());
        } else {
            System.out.println("��ǰ�̲߳�������״̬�����ܵ���resume()����.");
        }
    }
}
