package com.j2h.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		try {
			Adapter5V v110 = new Voltage110Adapter();
			System.out.println("110V��ѹ������" + v110.output5V(new AC110V()) + "V");
			Adapter5V v220 = new Voltage220Adapter();
			System.out.println("220V��ѹ������" + v220.output5V(new AC220V()) + "V");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}