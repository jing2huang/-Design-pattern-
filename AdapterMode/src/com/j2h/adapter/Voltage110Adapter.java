package com.j2h.adapter;

//�������ࣨ�ͻ���Ҫ�Ķ���
public class Voltage110Adapter implements Adapter5V {

	//��ԭ���Ķ�������ɿͻ���Ҫ��
	public int output5V(AC inputAc) throws Exception {
		if (!(inputAc instanceof AC110V)) {
			throw new Exception("������ѡ�����");
		}
		return inputAc.output() / 22;
	}

}