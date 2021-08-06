package com.j2h.state;

//具体状态类：就绪状态
public class Runnable extends ThreadState {

	public Runnable() {
		state = "runnable";
		System.out.println("线程当前处于：就绪状态...");
	}
	
	//就绪状态对应的行为
	public void getCPU(ThreadContext ctx) {
		System.out.print("竞争CPU资源-->");
		if ("runnable".equals(state)) {
			ctx.setState(new Running());
		} else {
			System.out.println("当前线程不是就绪状态，不能竞争CPU资源...");
		}
	}

}