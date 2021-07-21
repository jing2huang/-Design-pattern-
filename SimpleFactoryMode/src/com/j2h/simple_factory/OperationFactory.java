package com.j2h.simple_factory;

//工厂类：主要负责生产满足条件的对象
public class OperationFactory {

	//根据需求生产需要的对象
	public static Operation createObj(String type) {
		Operation obj = null;
		switch (type) {
		case "+":
			obj = new OperationAdd();
			break;
		case "-":
			obj = new OperationSub();
			break;
		case "*":
			obj = new OperationMult();
			break;
		default:
			break;
		}
		return obj;
	}
}