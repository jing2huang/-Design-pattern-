package com.j2h.state;

//具体状态类：阻塞状态
public class Blocked extends ThreadState {

	public Blocked() {
        state = "blocked";
        System.out.println("当前线程处于：阻塞状态.");
    }

	//阻塞状态对应的行为
    public void resume(ThreadContext ctx) {
        System.out.print("调用resume()方法-->");
        if ("blocked".equals(state)) {
        	ctx.setState(new Runnable());
        } else {
            System.out.println("当前线程不是阻塞状态，不能调用resume()方法.");
        }
    }
}
