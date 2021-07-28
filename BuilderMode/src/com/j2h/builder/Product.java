package com.j2h.builder;

//产品角色
public class Product {

	private String partA;
	private String partB;
	private String partC;

	public Product(String partA, String partB, String partC) {
		this.partA = partA;
		this.partB = partB;
		this.partC = partC;
	}
	
	public String getPartA() {
		return partA;
	}

	public void setPartA(String partA) {
		this.partA = partA;
	}

	public String getPartB() {
		return partB;
	}

	public void setPartB(String partB) {
		this.partB = partB;
	}

	public String getPartC() {
		return partC;
	}

	public void setPartC(String partC) {
		this.partC = partC;
	}

	public void show() {
		System.out.println("产品包括【" + this.partA + " ," + this.partB + " ," + this.partC + "】");
	}
}