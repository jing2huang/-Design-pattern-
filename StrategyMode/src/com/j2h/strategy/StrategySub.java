package com.j2h.strategy;

//��������
public class StrategySub implements Strategy {

	@Override
	public int doOperate(int a, int b) {
		return a - b;
	}

}