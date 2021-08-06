package com.j2h.state;

public class ThreadStateTest {

	public static void main(String[] args) {
		ThreadContext ctx = new ThreadContext();
		ctx.start();
		ctx.getCPU();
		ctx.suspend();
		ctx.resume();
		ctx.getCPU();
		ctx.stop();
	}
}
