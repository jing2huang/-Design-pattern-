package com.j2h.builder;

//ָ����
public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	//��ɸ��Ӷ���Ĵ���
	public Product construct() {
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
		return builder.buildProduct();
	}
}