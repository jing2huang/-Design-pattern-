package com.j2h.state;

//具体状态：就绪状态
public class New extends ThreadState {

	public New() {
		state = "new";
		System.out.println("当前线程处于：新建状态...");
	}

	//新建状态对应的行为
	public void start(ThreadContext ctx) {
		System.out.print("调用start()方法-->");
		if ("new".equals(state)) {
			ctx.setState(new Runnable());
		} else {
			System.out.println("当前线程不是新建状态，不能调用start()方法");
		}
	}

}