package com.j2h.strategy;

//�˷�����
public class StrategyMult implements Strategy {

	@Override
	public int doOperate(int a, int b) {
		return a * b;
	}
}
