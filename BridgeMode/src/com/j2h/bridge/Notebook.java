package com.j2h.bridge;

public class Notebook extends Computer {

	public Notebook(Brand brand) {
		super(brand);
	}

	@Override
	public void sale() {
		System.out.print("±Ê¼Ç±¾µçÄÔ£º");
		brand.sale();
	}

}