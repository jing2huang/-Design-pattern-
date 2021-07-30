package com.j2h.template_method;

//抽象类
public abstract class FoodToFridge {

	private void openFridge() {
		System.out.println("打开冰箱");
	}

	public abstract void putFoodToFridge();
	
	private void closeFridge() {
		System.out.println("关上冰箱");
	}
	
	//模板方法
	public final void execute() {
		openFridge();
		putFoodToFridge();
		closeFridge();
	}

}