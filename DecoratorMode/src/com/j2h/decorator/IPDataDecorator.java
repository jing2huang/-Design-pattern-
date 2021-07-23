package com.j2h.decorator;

public class IPDataDecorator extends DataDecorator {

	public IPDataDecorator(Data data) {
		super(data);
	}

	public void addHeader() {
		System.out.print("Data add IP header, ");
	}
	
	@Override
	public void send() {
		addHeader();
		data.send();
	}
}
