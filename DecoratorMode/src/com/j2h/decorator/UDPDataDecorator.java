package com.j2h.decorator;

//�����װ������
public class UDPDataDecorator extends DataDecorator {

	public UDPDataDecorator(Data data) {
		super(data);
	}

	public void addHeader() {
		System.out.print("Data add UDP header, ");
	}

	@Override
	public void send() {
		addHeader(); //�������ӵĲ���
		data.send();
	}
}