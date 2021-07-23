package com.j2h.decorator;

//被装饰对象
public class AppData implements Data {

	@Override
	public void send() {
		System.out.println("app发送数据!");
	}

}