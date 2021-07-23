package com.j2h.decorator;

//装饰对象的抽象类：持有一个具体的被修饰对象，并实现与被装饰类的公共接口
public abstract class DataDecorator implements Data {

	//具体的修饰对象
	protected Data data;
	public DataDecorator(Data data) {
		this.data = data;
	}

	@Override
	public void send() {
		data.send();
	}

}