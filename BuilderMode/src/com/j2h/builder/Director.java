package com.j2h.builder;

//指挥者
public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	//完成复杂对象的创建
	public Product construct() {
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
		return builder.buildProduct();
	}
}