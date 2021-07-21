package com.j2h.strategy;

//¼Ó·¨²ßÂÔ
public class StrategyAdd implements Strategy {

	@Override
	public int doOperate(int a, int b) {
		return a + b;
	}
}
