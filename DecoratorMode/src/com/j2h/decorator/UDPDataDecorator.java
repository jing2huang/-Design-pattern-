package com.j2h.decorator;

//具体的装饰器类
public class UDPDataDecorator extends DataDecorator {

	public UDPDataDecorator(Data data) {
		super(data);
	}

	public void addHeader() {
		System.out.print("Data add UDP header, ");
	}

	@Override
	public void send() {
		addHeader(); //额外增加的操作
		data.send();
	}
}