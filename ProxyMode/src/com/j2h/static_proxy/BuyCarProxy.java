package com.j2h.static_proxy;

//������
public class BuyCarProxy implements BuyCar {
	
	private BuyCar buy;
	
	public BuyCarProxy(BuyCar buy) {
		this.buy = buy;
	}
	
	@Override
	public void buyCar() {
		System.out.println("��ǰѰ�ҳ�Դ��������������׼��������");
		buy.buyCar();
		System.out.println("�򳵺��仧���ϱ��յȹ�����");
	}
}
