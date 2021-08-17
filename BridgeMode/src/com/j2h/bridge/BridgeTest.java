package com.j2h.bridge;

public class BridgeTest {

	public static void main(String[] args) {
		Computer c1 = new Desktop(new Lenovo());
		c1.sale();
		Computer c2 = new Notebook(new Lenovo());
		c2.sale();
		Computer c3 = new Desktop(new Dell());
		c3.sale();
		Computer c4 = new Notebook(new Dell());
		c4.sale();
	}
}