package com.j2h.bridge;

public class Notebook extends Computer {

	public Notebook(Brand brand) {
		super(brand);
	}

	@Override
	public void sale() {
		System.out.print("�ʼǱ����ԣ�");
		brand.sale();
	}

}