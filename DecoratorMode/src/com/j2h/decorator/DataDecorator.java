package com.j2h.decorator;

//װ�ζ���ĳ����ࣺ����һ������ı����ζ��󣬲�ʵ���뱻װ����Ĺ����ӿ�
public abstract class DataDecorator implements Data {

	//��������ζ���
	protected Data data;
	public DataDecorator(Data data) {
		this.data = data;
	}

	@Override
	public void send() {
		data.send();
	}

}