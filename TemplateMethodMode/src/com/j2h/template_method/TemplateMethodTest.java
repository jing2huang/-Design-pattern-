package com.j2h.template_method;

public class TemplateMethodTest {

	public static void main(String[] args) {
		executeTest01();
		System.out.println("=========================");
		executeTest02();
	}

	public static void executeTest01() {
		VegetablesToFridge vtf = new VegetablesToFridge();
		vtf.execute();
	}

	public static void executeTest02() {
		//�����ڲ��෽ʽ
		FoodToFridge ftf = new FoodToFridge() {
			@Override
			public void putFoodToFridge() {
				System.out.println("��ˮ���������");
			}
		};
		ftf.execute();
	}
}
