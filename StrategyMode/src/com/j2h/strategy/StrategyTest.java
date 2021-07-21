package com.j2h.strategy;

public class StrategyTest {

	public static void main(String[] args) {
		//加法策略
		StrategyContext context = new StrategyContext(new StrategyAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		//减法策略
		StrategyContext context1 = new StrategyContext(new StrategySub());
		System.out.println("10 + 5 = " + context1.executeStrategy(10, 5));

		//乘法策略
		StrategyContext context2 = new StrategyContext(new StrategyMult());
		System.out.println("10 + 5 = " + context2.executeStrategy(10, 5));
	}

}