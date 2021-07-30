package com.j2h.template_method;

//������
public abstract class FoodToFridge {

	private void openFridge() {
		System.out.println("�򿪱���");
	}

	public abstract void putFoodToFridge();
	
	private void closeFridge() {
		System.out.println("���ϱ���");
	}
	
	//ģ�巽��
	public final void execute() {
		openFridge();
		putFoodToFridge();
		closeFridge();
	}

}