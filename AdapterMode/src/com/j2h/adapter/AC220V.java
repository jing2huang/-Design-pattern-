package com.j2h.adapter;

//适配者类：220V电压（原本的接口实现）
public class AC220V implements AC {

	private final int output = 220;
	
	@Override
	public int output() {
		return output;
	}

}