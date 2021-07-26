package com.j2h.adapter;

//适配器类（客户需要的对象）
public class Voltage110Adapter implements Adapter5V {

	//将原本的对象适配成客户需要的
	public int output5V(AC inputAc) throws Exception {
		if (!(inputAc instanceof AC110V)) {
			throw new Exception("适配器选择错误");
		}
		return inputAc.output() / 22;
	}

}