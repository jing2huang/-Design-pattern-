package com.j2h.bridge;

//������󻯽�ɫ��̨ʽ��
public class Desktop extends Computer {

	public Desktop(Brand brand) {
		super(brand);
	}

	@Override
	public void sale() {
		System.out.print("̨ʽ����");
		brand.sale();
	}

}
