package com.j2h.decorator;

//具体的装饰器类（tcp装饰器类：给发送的数据额外添加请求头）
public class TCPDataDecorator extends DataDecorator {

	public TCPDataDecorator(Data data) {
		super(data);
	}

	public void addHeader() {
		System.out.print("Data add TCP header, ");
	}
	
	@Override
	public void send() {
		addHeader(); //额外扩展的操作
		data.send();
	}
}