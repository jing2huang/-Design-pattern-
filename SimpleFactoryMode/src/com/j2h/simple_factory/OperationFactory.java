package com.j2h.simple_factory;

//�����ࣺ��Ҫ�����������������Ķ���
public class OperationFactory {

	//��������������Ҫ�Ķ���
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