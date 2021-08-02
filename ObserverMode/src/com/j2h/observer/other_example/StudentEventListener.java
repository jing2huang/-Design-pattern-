package com.j2h.observer.other_example;

//具体观察者类：学生事件监听器
public class StudentEventListener implements BellEventListener {

	@Override
	public void heardBell(RingEvent e) {
		if (e.isSound()) {
            System.out.println("同学们，上课了...");
        } else {
            System.out.println("同学们，下课了...");
        }
	}

}