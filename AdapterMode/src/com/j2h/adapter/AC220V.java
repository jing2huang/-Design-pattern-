package com.j2h.adapter;

//�������ࣺ220V��ѹ��ԭ���Ľӿ�ʵ�֣�
public class AC220V implements AC {

	private final int output = 220;
	
	@Override
	public int output() {
		return output;
	}

}