package com.j2h.adapter;

//�������ࣺ110V��ѹ��ԭ���Ľӿ�ʵ�֣�
public class AC110V implements AC {

	private final int output = 110;
	
	@Override
	public int output() {
		return output;
	}
}