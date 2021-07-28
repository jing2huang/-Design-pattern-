package com.j2h.builder;

//抽象建造者
abstract class Builder {

	public abstract void buildPartA();
	public abstract void buildPartB();
	public abstract void buildPartC();
	public abstract Product buildProduct();
	
}