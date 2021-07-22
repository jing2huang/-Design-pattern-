package com.j2h.simple_factory.fruit_factory;

//�����ࣺ������������Ĳ�Ʒ������
public class FruitFactory {

	public static Fruit createFruit(String type) {
		Fruit fruit = null;
		switch (type) {
		case "apple":
			fruit = new Apple();
			break;
		case "orange":
			fruit = new Orange();
			break;
		case "banana":
			fruit = new Banana();
			break;

		}
		return fruit;
	}
}