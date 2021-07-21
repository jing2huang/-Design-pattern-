package com.j2h.strategy;

//¼õ·¨²ßÂÔ
public class StrategySub implements Strategy {

	@Override
	public int doOperate(int a, int b) {
		return a - b;
	}

}