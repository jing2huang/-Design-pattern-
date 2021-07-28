package com.j2h.builder;

//具体建造者
public class ConcreteBuilder extends Builder {

	String partA;
	String partB;
	String partC;

	//各部件生产
	@Override
	public void buildPartA() {
		this.partA = "部件A";
	}

	@Override
	public void buildPartB() {
		this.partB = "部件B";
	}

	@Override
	public void buildPartC() {
		this.partC = "部件C";
	}

	//组装
	@Override
	public Product buildProduct() {
		return new Product(this.partA, this.partB, this.partC);
	}
}
