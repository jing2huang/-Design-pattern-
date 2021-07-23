package com.j2h.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		Data data = new AppData();
		System.out.println("=======FIRST==========");
		UDPDataDecorator udp = new UDPDataDecorator(data);
		udp.send();
		System.out.println("=======SECOND==========");
		IPDataDecorator ip = new IPDataDecorator(data);
		TCPDataDecorator tcp = new TCPDataDecorator(ip);
		tcp.send();
	}
}