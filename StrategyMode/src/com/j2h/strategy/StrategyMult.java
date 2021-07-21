package com.j2h.strategy;

//³Ë·¨²ßÂÔ
public class StrategyMult implements Strategy {

	@Override
	public int doOperate(int a, int b) {
		return a * b;
	}
}
