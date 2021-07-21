package com.j2h.strategy;

public class StrategyContext {

	private Strategy strategy;
	
	public StrategyContext(Strategy strategy) {
		this.strategy = strategy;
	}

	public int executeStrategy(int a, int b) {
	    return strategy.doOperate(a, b);
	}
}