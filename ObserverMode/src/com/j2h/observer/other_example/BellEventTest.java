package com.j2h.observer.other_example;

public class BellEventTest {

	public static void main(String[] args) {
        BellEventSource bell = new BellEventSource();    //铃（事件源）
        bell.registerEventListener(new TeacherEventListener()); //注册监听器（老师）
        bell.registerEventListener(new StudentEventListener());    //注册监听器（学生）
        bell.ring(true);   //打上课铃声
        System.out.println("------------");
        bell.ring(false);  //打下课铃声
	}
}