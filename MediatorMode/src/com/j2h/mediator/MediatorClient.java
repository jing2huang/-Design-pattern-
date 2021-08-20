package com.j2h.mediator;

public class MediatorClient {

	public static void main(String[] args) {
		UnitedNationsSecurityCouncil unsc = new UnitedNationsSecurityCouncil();
		CHINA china = new CHINA(unsc);
		USA usa = new USA(unsc);
		unsc.setCHINA(china);
		unsc.setUSA(usa);
		
		china.declare("�й�����������̨�����й�������̨���������й��������������κ���������Ⱦָ̨������!!!");
		usa.declare("�����������������ǳ���̨�����й�BABA�����������ǽ��������̨������...");
		
	}
}
