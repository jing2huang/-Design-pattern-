package com.j2h.strategy;

//�ӷ�����
public class StrategyAdd implements Strategy {

	@Override
	public int doOperate(int a, int b) {
		return a + b;
	}
}
