package com.j2h.chainofresponsibility;

//�ͻ����ɫ������������
public class ChainClient {

	public static void main(String[] args) {
		//����������
		Leader departManager = new DepartManager();
		Leader boss = new Boss();
		departManager.setNext(boss);
		departManager.handleRequest(20);
	}
}