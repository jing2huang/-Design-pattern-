package com.j2h.simple_factory.fruit_factory;

public class FruitTest {

	public static void main(String[] args) {
		Fruit fruit = FruitFactory.createFruit("apple");
		fruit.produce();
	}

}