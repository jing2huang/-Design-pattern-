package com.j2h.simple_factory;

public class OperationTest {

	public static void main(String[] args) {
		Operation operateAdd = OperationFactory.createObj("+");
		System.out.println("a + b = " + operateAdd.operate(10, 5));
		
		Operation operateSub = OperationFactory.createObj("-");
		System.out.println("a - b = " + operateSub.operate(10, 5));
		
		Operation operateMult = OperationFactory.createObj("*");
		System.out.println("a * b = " + operateMult.operate(10, 5));
	}

}