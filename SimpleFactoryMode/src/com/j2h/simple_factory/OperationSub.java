package com.j2h.simple_factory;

public class OperationSub implements Operation {

	@Override
	public int operate(int a, int b) {
		return a - b;
	}
}
