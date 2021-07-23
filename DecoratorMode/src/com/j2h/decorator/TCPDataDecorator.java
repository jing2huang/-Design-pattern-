package com.j2h.decorator;

//�����װ�����ࣨtcpװ�����ࣺ�����͵����ݶ����������ͷ��
public class TCPDataDecorator extends DataDecorator {

	public TCPDataDecorator(Data data) {
		super(data);
	}

	public void addHeader() {
		System.out.print("Data add TCP header, ");
	}
	
	@Override
	public void send() {
		addHeader(); //������չ�Ĳ���
		data.send();
	}
}