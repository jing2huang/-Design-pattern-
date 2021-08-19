package com.j2h.chainofresponsibility;

//客户类角色：创建责任链
public class ChainClient {

	public static void main(String[] args) {
		//创建责任链
		Leader departManager = new DepartManager();
		Leader boss = new Boss();
		departManager.setNext(boss);
		departManager.handleRequest(20);
	}
}