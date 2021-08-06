package com.j2h.state;

//具体状态类：运行状态
public class Running extends ThreadState {

	public Running() {
		state = "running";
		System.out.println("当前线程处于：运行状态...");
	}

	//运行状态对应的行为
    public void suspend(ThreadContext ctx) {
        System.out.print("调用suspend()方法-->");
        if ("running".equals(state)) {
        	ctx.setState(new Blocked());
        } else {
            System.out.println("当前线程不是运行状态，不能调用suspend()方法.");
        }
    }

    public void stop(ThreadContext ctx) {
        System.out.print("调用stop()方法-->");
        if ("running".equals(state)) {
        	ctx.setState(new Dead());
        } else {
            System.out.println("当前线程不是运行状态，不能调用stop()方法.");
        }
    }
}