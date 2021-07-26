package com.j2h.adapter;

//ÊÊÅäÆ÷Àà
public class Voltage220Adapter implements Adapter5V {

	public int output5V(AC inputAc) throws Exception {
		if (!(inputAc instanceof AC220V)) {
			throw new Exception("ÊÊÅäÆ÷Ñ¡Ôñ´íÎó");
		}
		return inputAc.output() / 44;
	}

}