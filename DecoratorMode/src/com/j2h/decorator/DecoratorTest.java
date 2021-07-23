package com.j2h.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		Data data = new AppData();
		TCPDataDecorator tcp = new TCPDataDecorator(data);
		tcp.send();
		UDPDataDecorator udp = new UDPDataDecorator(data);
		udp.send();
	}
}