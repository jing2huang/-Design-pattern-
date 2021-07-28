package com.j2h.builder;

//���彨����
public class ConcreteBuilder extends Builder {

	String partA;
	String partB;
	String partC;

	//����������
	@Override
	public void buildPartA() {
		this.partA = "����A";
	}

	@Override
	public void buildPartB() {
		this.partB = "����B";
	}

	@Override
	public void buildPartC() {
		this.partC = "����C";
	}

	//��װ
	@Override
	public Product buildProduct() {
		return new Product(this.partA, this.partB, this.partC);
	}
}
