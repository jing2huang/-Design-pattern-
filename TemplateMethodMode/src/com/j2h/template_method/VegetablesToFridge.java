package com.j2h.template_method;

//具体实现
public class VegetablesToFridge extends FoodToFridge {

	@Override
	public void putFoodToFridge() {
		System.out.println("把蔬菜放入冰箱");
	}

}